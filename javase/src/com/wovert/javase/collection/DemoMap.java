package com.wovert.javase.collection;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        m1.put(1, "one");
        m1.put(2, "two");
        m1.put(3, "three");

        m1.put(2, "222"); // equals() 判断覆盖

        Object obj = m1.get(2);
        System.out.println(obj);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("3"));
        System.out.println(m1.containsValue("three"));

        m1.remove(3);
        System.out.println(m1);

        Map m2 = new HashMap();
        m2.put("yi", "111");
        m2.put("er", "222");

        m1.putAll(m2);

        System.out.println(m1);

        List<String> list = new ArrayList<>();
        list.add("aaa");
        String str = list.get(0);
        System.out.println(str);

        Set<Integer> set = new HashSet<>();
//        set.add("ddd");

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        System.out.println(map);

        Set<String> keys = map.keySet();
        for(String temp:keys) {
            System.out.println(temp);
            System.out.println(map.get(temp));
        }

        // 遍历值
        Collection<String> values = map.values();
        for(String value:values) {
            System.out.println(value);
        }

        // EntrySet 遍历 key,value
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry e: entrySet) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

        map.forEach(
                (String k, String v) -> {
                    System.out.println(k + "=>" + v);
                }
        );
    }
}
