package com.wovert.javase.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("张三", "张三丰", "刘德华", "张学友"));
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        for(String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        for(String s : list) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        System.out.println(list3);

        // filter
        list.stream()
                .filter( s -> s.startsWith("张"))
                .filter( s -> s.length() == 3)
                .forEach(
                    s -> System.out.println(s)
                );

        // 单列集合
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ccc");
        arrayList.add("ccc");
//        Stream<String> stream = arrayList.stream();
//        stream.forEach( s-> System.out.println(s));
        arrayList.stream().forEach(s-> System.out.println(s));

        // 双列集合
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张三", 20);
        hm.put("李四", 18);
        hm.put("王五", 23);
        hm.put("赵六", 37);

        hm.keySet().stream().forEach(s-> System.out.println(s));
        hm.values().stream().forEach(s-> System.out.println(s));
        hm.entrySet().stream().forEach(s-> System.out.println(s.getKey() +"=>" + s.getValue()));

        // 数组
        int[] arr = {1,2,3,4};
        Arrays.stream(arr).forEach(s-> System.out.println(s));

        // 同种数据类型的多个数据
        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));


        // 过滤方法
        // filter方法获取流中的每一个数据
        // test方法中的s,一依次表示流中的每一个数据， true: 留下
        list.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        boolean result = s.startsWith("张");
                        return result;
                    }
                }
        ).forEach(s-> System.out.println(s));

        // Lambda 表达式
        list.stream().filter(s-> s.startsWith("张")).forEach(s-> System.out.println(s));

        // 前面2个元素
        list.stream().limit(2).forEach(s-> System.out.println(s));

        // 忽略前2个元素
        list.stream().skip(2).forEach(s-> System.out.println(s));

        // 合并流
        Stream.concat(list.stream(), arrayList.stream()).forEach(s-> System.out.println(s));

        // 去除重复的元素，以来(HashCode和equals方法)
        arrayList.stream().distinct().forEach(s-> System.out.println(s));

        System.out.println("forEach------------");
        arrayList.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );

        System.out.println(arrayList.stream().count());

        // 收集方法
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i=1; i<=10; i++) {
            list4.add(i);
        }
        list4.add(10);
        list4.add(10);
        list4.add(10);
        list4.add(10);
        // Collectors.toList(): 在底层会创建一个List集合，并把所有的数据添加到List集合中
        List<Integer> list5 = list4.stream().collect(Collectors.toList());
        System.out.println(list5);
        Set<Integer> set1 = list4.stream().collect(Collectors.toSet());
        System.out.println(set1);

    }
}
