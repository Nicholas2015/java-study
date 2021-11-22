package com.study.java.pattern.proxy.customproxy;

import java.io.*;

public class CustomClassLoader extends ClassLoader {

    private File classPathFile;

    public CustomClassLoader() {
        String classPath = CustomClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = CustomClassLoader.class.getPackage().getName() + "." + name;
        if (null != classPathFile) {
            File file = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (file.exists()) {
                FileInputStream fis = null;
                ByteArrayOutputStream baos = null;
                try {
                    fis = new FileInputStream(file);
                    baos = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = fis.read(buff)) != -1) {
                        baos.write(buff, 0, len);
                    }
                    return defineClass(className, baos.toByteArray(), 0, baos.size());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
        return null;
    }
}
