package com.wovert.javase.io.chartream;

import java.io.*;

public class DemoCharStream {
    public static void main(String[] args) throws IOException {
//        charWrite();
        charRead();
    }

    private static void charRead() throws IOException {
        FileReader fr = new FileReader("javase\\images\\charfile");
        // 字符缓冲输入流
        BufferedReader br = new BufferedReader(fr);

        // 一次读取一个字符
//        int ch;
//        while((ch = fr.read()) != -1) {
//            System.out.print((char)ch);
//        }

        // 一次读取多个字符
        // 读到的字符存入到chars数组
        // 返回本次读到的多少个字符
//        char[] chars = new char[1024];
//        int len;
//
//        while((len = fr.read(chars)) != -1) {
//            System.out.print(new String(chars, 0, len));
//        }

//        char[] chars = new char[1024];
//        int len;
//
//        while((len = br.read(chars)) != -1) {
//            System.out.print(new String(chars, 0, len));
//        }
//
//        fr.close();

//        String line1 = br.readLine();
//        String line2 = br.readLine();
//        String line3 = br.readLine();
//        String line4 = br.readLine();
//
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        System.out.println(line4);

        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    private static void charWrite() throws IOException {
        // 创建字符输出流对象：文件不存在，则创建，存在，则清空
        FileWriter fw = new FileWriter("javase\\images\\charfile");
        // 字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(fw);

        // 写出数据
//        fw.write(97);
//        fw.write(98);
//        fw.write(99);

        // 写出一个字符数组
//        char[] chars = {97,98,99,100};
//        fw.write(chars);
//        fw.write(chars, 0, 2);

        // 字符串
        String line = "微明abc";
//        fw.write(line);
//        fw.write(line, 1,2);
//        fw.flush(); // 刷新流，刷新完毕之后，还可以继续写数据
//        fw.write("666");
//        fw.flush();


        bw.write(line, 0,3);
        bw.newLine(); // 跨平台回车换行符号
        bw.write("xyz");
        bw.newLine();
        bw.write("abc");
        // 释放
        bw.close(); // 关闭流，释放资源，一旦关闭，就不能写数据
    }
}
