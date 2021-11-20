package com.study.java.pattern.factory.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class CourseFactory {

//    public static ICourse create(String name) {
//
//        if (Objects.equals("java",name)) {
//            return new JavaCourse();
//        }
//        if (Objects.equals("python",name)) {
//            return new PythonCourse();
//        }
//        return null;
//    }

//    public static ICourse create(String className){
//        if (null != className || "" != className) {
//            try {
//                return (ICourse) Class.forName(className).getDeclaredConstructor().newInstance();
//            } catch (ClassNotFoundException | NoSuchMethodException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
    //        return null;
//    }

//    public static ICourse create(Class clazz){
//        if (null != clazz) {
//            try {
//               return (ICourse) clazz.getDeclaredConstructor().newInstance();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

    // 第三种优化控制入参范围
    public static ICourse create(Class<? extends ICourse> clazz) {
        if (null != clazz) {
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
