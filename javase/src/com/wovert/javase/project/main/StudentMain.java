package com.wovert.javase.project.main;

import com.wovert.javase.project.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        quite:while(true) {
            showMenu();
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("add student");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("delete student");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("modify student");
                    modifyStudent(list);
                    break;
                case "4":
                    System.out.println("view student");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("Thanks you!");
                    break quite;
                default:
                    System.out.println("Input erorr!");
                    break;
            }
        }
    }

    private static void modifyStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Has no students data!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input modify student's sid:");
        String sid = sc.next();
        int index = getStudent(list, sid);

        if (index == -1) {
            System.out.println("Has no sid=" + sid + " student infomation!");
        } else {
            Student stu = list.get(index);
            System.out.println("Please input name:");
            String name = sc.next();
            System.out.println("name="+ name + "---");

            System.out.println("Please input age:");
            int age = sc.nextInt();

            System.out.println("Please input birthday:");
            String birthday = sc.next();

            stu.setName(name);
            stu.setAge(age);
            stu.setBirthday(birthday);
            System.out.println(sid + " student modify successful!");
        }
    }

    private static void showMenu() {
        System.out.println("---------------Welcome Student Manager System---------------");
        System.out.println("1 add student");
        System.out.println("2 delete student");
        System.out.println("3 modify student");
        System.out.println("4 view student");
        System.out.println("5 exit");
        System.out.println("Please input number:");
    }

    private static void deleteStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Has no students data!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input delete student's sid:");
        String sid = sc.next();
        int index = getStudent(list, sid);

        if (index == -1) {
            System.out.println("Has no sid=" + sid + " student infomation!");
        } else {
            list.remove(index);
            System.out.println(sid + " student delete successful!");
        }
    }

    public static int getStudent(ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i=0; i<list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getSid().equals(sid)) {
                index = i;
            }
        }
        return index;
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Has no students data!");
            return;
        }

        System.out.println("No\tName\tAge\tBirthday");
        for (int i=0; i<list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    // add student
    public static void addStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        String sid;
        while(true) {
            System.out.println("Please input sid:");
            sid = sc.next();

            int index = getStudent(list, sid);
            if (index == -1) {
                break;
            }

        }

        System.out.println("Please input name:");
        String name = sc.next();

        System.out.println("Please input age:");
        int age = sc.nextInt();

        System.out.println("Please input birthday:");
        String birthday = sc.next();

        Student stu = new Student(sid, name, age, birthday);
        list.add(stu);
        System.out.println("Add student successful!");
    }
}
