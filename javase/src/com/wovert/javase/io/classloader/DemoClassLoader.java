package com.wovert.javase.io.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoClassLoader {
    public static void main(String[] args) throws IOException {
        ClassLoader cls = ClassLoader.getSystemClassLoader();
        // 文件在src目录内
        InputStream is = cls.getResourceAsStream("prop.properties");

        Properties prop = new Properties();
        prop.load(is);

        System.out.println(prop);
        is.close();
    }
}
