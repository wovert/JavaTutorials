package com.wovert.javase.io.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("小龙女", "尹志平");
        // 特有方法1
        prop.setProperty("江苏", "南京");
        prop.put("郭襄", "杨过");
        prop.put("黄蓉", "欧阳克");

        System.out.println(prop);

        prop.remove("郭襄");
        System.out.println(prop);

        prop.put("小龙女", "杨过");
        System.out.println(prop);

        Object obj = prop.get("黄蓉");
        System.out.println(obj);

        // 特有方法2
        Object obj2 = prop.getProperty("江苏");
        System.out.println(obj2);

        Set<Object> keys = prop.keySet();
        for(Object key: keys) {
            Object val = prop.get(key);
            System.out.println(key + "=" + val);
        }

        // 特有方法3
        Set<String> keys2 = prop.stringPropertyNames();
        for(String key: keys2) {
            Object val = prop.getProperty(key);
            System.out.println(key + ":" + val);
        }

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for(Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + "=" + val);
        }

        System.out.println("--------------------");

        // 读取
        Properties prop2 = new Properties();
        FileReader fr = new FileReader("javase\\prop.properties");
        prop2.load(fr);
        fr.close();

        System.out.println(prop2);

        System.out.println("--------------------");

        Properties prop3 = new Properties();
        prop3.setProperty("张三", "23");
        prop3.setProperty("李四", "25");
        FileWriter fw = new FileWriter("javase\\prop2.properties");
        prop3.store(fw, "注释内容");
        fw.close();
    }
}
