package com.wovert.javase.reflection;

import com.wovert.javase.project.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoRefrection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
         // 1. Class类中的静态方法forName("全类名")
        Class clazz = Class.forName("com.wovert.javase.project.domain.Student");
        System.out.println(clazz);

        // 2.通过class属性获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        // 3.利用对象的getClass方法来获取class对象
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);

        System.out.println("-------获取所有公共的构造方法对象的数组--------");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("-------获取所有构造方法对象的数组--------");
        Constructor[] dc = clazz.getDeclaredConstructors();
        for (Constructor constructor : dc) {
            System.out.println(constructor);
        }

        System.out.println("-------获取单个公共构造方法对象--------");
        Constructor sdc = clazz.getConstructor();
        System.out.println(sdc);

        Constructor sdc2 = clazz.getConstructor(String.class, String.class, int.class, String.class);
        System.out.println(sdc2);

        System.out.println("-------获取单个私有构造方法对象--------");
        Constructor scd = clazz.getDeclaredConstructor(String.class, String.class);
        System.out.println(scd);


        System.out.println("-------创建对象--------");
        Student stu = (Student)sdc2.newInstance("1", "张三", 20, "1923-3-9");
        System.out.println(stu);

        System.out.println("-------非public构造方法: 暴力反射--------");
        scd.setAccessible(true);
        Student stu2 = (Student)scd.newInstance("2", "李四");
        System.out.println(stu2);

        System.out.println("-------获取field所有对象--------");
//        Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("-------获取name成员变量(成员变量必须存在且必须是public)--------");
        Field field = clazz.getField("name");
        System.out.println(field +"=>" + field.getName());

        Field field1 = clazz.getDeclaredField("age");
        System.out.println(field1 +"=>" + field1.getName());

        System.out.println("-------赋值--------");

        Student stu3 = (Student)clazz.newInstance();
        field.set(stu3, "王五");
        field1.setAccessible(true); // 取消访问检查
        field1.set(stu3, 99);
        System.out.println(stu3);

        System.out.println("-------获取方法--------");
//        Method[] methods = clazz.getMethods();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method method = clazz.getMethod("getName");
        System.out.println(method);

        Method method2 = clazz.getMethod("setAge", int.class);
        System.out.println(method2);

        Method method3 = clazz.getDeclaredMethod("setAge", int.class);
        System.out.println(method3);

        // 调用方法，返回方法的返回值
        Object result = method3.invoke(stu3, 88);
        System.out.println(result);
        System.out.println(stu3);

    }
}
