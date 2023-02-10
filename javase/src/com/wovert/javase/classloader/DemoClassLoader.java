package com.wovert.javase.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoClassLoader {
    public static void main(String[] args) throws IOException {
        // 获取系统类加载器
        ClassLoader sc = ClassLoader.getSystemClassLoader();

        // 获取系统类加载器的父加载器 —— 平台类加载器
        ClassLoader classLoader1 = sc.getParent();

        // 获取平台类加载器的父加载器 —— 启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();

        System.out.println("系统类加载器：" + sc);
        System.out.println("平台类加载器：" + classLoader1);
        System.out.println("启动类加载器：" + classLoader2);

        // 加载器加载一个指定的文件
        // 参数：文件路径
        // 返回值：字节流
        InputStream is = sc.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(is);

        System.out.println(prop);

        is.close();
    }
}
