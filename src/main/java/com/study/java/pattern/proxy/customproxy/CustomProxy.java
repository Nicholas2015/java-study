package com.study.java.pattern.proxy.customproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomProxy {

    public static final String ln = "\n";

    public static Object newProxyInstance(CustomClassLoader loader,
                                          Class<?>[] interfaces,
                                          CustomInvocationHandler h) throws Exception {
        // 1.动态生成源码.java文件
        String source = generatrSource(interfaces);
        // 2.java文件输出到磁盘，保存为文件$Proxy0.java
        String filePath = CustomsProxy.class.getResource("").getPath();
        File file = new File(filePath + "$Proxy0.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(source);
        fileWriter.flush();
        fileWriter.close();

        // 3.把.java文件编译成$Proxy.class文件
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask javaCompilerTask = javaCompiler.getTask(null, manager, null, null, null, iterable);
        Boolean call = javaCompilerTask.call();
        if(call){
            System.out.println("生成成功");
        } else{
            System.out.println("生成失败");
        }
        manager.close();

        // 4.把生成的.class文件加载到JVM中
        Class<?> aClass = loader.findClass("$Proxy0");
        Constructor<?> constructor = aClass.getConstructor(CustomInvocationHandler.class);

        // 5.返回新的代理对象
        return constructor.newInstance(h);
    }

    private static String generatrSource(Class<?>[] interfaces){
        StringBuilder sb = new StringBuilder();
        sb.append("package com.study.java.pattern.proxy.customproxy;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("import com.study.java.pattern.proxy.customproxy.IPerson;" + ln);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + " {" + ln);
        sb.append("CustomInvocationHandler h;" + ln);
        sb.append("public $Proxy0(CustomInvocationHandler h) {" + ln);
        sb.append("this.h = h;");
        sb.append("}"+ln);

        Method[] methods = interfaces[0].getMethods();

        for (Method method : methods) {
            Class<?>[] types = method.getParameterTypes();

            StringBuilder paramNames = new StringBuilder();
            StringBuilder paramValues = new StringBuilder();
            StringBuilder paramClasses = new StringBuilder();

            for (Class<?> type : types) {
                String name = type.getName();

            }

            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "() {" + ln);
            sb.append("try {"+ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(" + method.getName() + ", new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,new Object[]{});"+ ln);
            sb.append("return;");
            sb.append("} catch(Error _e) {"+ln);
            sb.append("} catch(Throwable e) {"+ln);
            sb.append("}"+ln);
            sb.append("}"+ln);
        }

        sb.append("}");
        return sb.toString();
    }
}
