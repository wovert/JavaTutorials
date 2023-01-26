package com.wovert.javase.io.objectstream;

import java.io.*;
import java.util.ArrayList;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject();
//        readObject();
        
        writeArrayListObject();
        readArrayListObject();
    }

    private static void readArrayListObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase\\images\\object.txt"));
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
        for (Student s: list) {
            System.out.println(s);
        }
    }

    private static void writeArrayListObject() throws IOException {
        // 对象输入流
        Student stu1 = new Student("张三", 28);
        Student stu2 = new Student("李四", 17);
        Student stu3 = new Student("王五", 32);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 对象输出流（字节输出流）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javase\\images\\object.txt"));
        oos.writeObject(list);
        oos.close();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase\\images\\object.txt"));
        // 反序列化
//        Student stu = (Student) ois.readObject();
//        System.out.println(stu);
        Object obj;
        while(true) {
            try {
                obj = ois.readObject();
            } catch (EOFException e) {
                break;
            }
            Student stu = (Student)obj;
            System.out.println(stu);
        }
    }

    private static void writeObject() throws IOException {
        // 对象输入流
        Student stu1 = new Student("张三", 28);
        Student stu2 = new Student("李四", 17);
        Student stu3 = new Student("王五", 32);

        // 对象输出流（字节输出流）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javase\\images\\object.txt"));
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.writeObject(stu3);
        oos.close();
    }
}
