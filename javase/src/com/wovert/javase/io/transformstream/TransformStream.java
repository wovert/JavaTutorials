package com.wovert.javase.io.transformstream;

import java.io.*;
import java.nio.charset.Charset;

public class TransformStream {
    public static void main(String[] args) throws IOException {
        // 读取字符流
        FileReader fr = new FileReader("javase\\images\\001.txt");
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        fr.close();

        System.out.println("------------------");

        // 转换流（字节流，编码）
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javase\\images\\001.txt"), "GBK");

        while((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();

        System.out.println("------------------");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javase\\images\\002.txt"), "UTF-8");
        osw.write("你好");
        osw.write("爱看书的肌肤");

        osw.close();

        System.out.println("------------------");

        // JDk11开始支持：转换流
        FileWriter fw = new FileWriter("javase\\images\\003.txt", Charset.forName("GBK"));
        fw.write("你好003.txt");
        fw.close();

    }
}
