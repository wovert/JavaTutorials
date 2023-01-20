package com.wovert.javase.io.chartream;

import java.io.*;

public class DemoCharStream {
    public static void main(String[] args) throws IOException {
        // 创建字符输出流对象：文件不存在，则创建，存在，则清空
        FileWriter fw = new FileWriter("javase\\images\\charfile");

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
        fw.write(line, 1,2);
        fw.flush(); // 刷新流，刷新完毕之后，还可以继续写数据
        fw.write("666");
        fw.flush();

        // 释放
        //fw.close(); 关闭流，释放资源，一旦关闭，就不能写数据
    }

    private static void byteStreamOutput() {
        FileOutputStream fos = null;
        try {
            System.out.println(2/0);
//        FileOutputStream fos = new FileOutputStream("javase\\images\\file");

            // 1，创建字节输出流对象, 文件不存在创建文件，文件存在文件清空
//        FileOutputStream fos = new FileOutputStream(new File("javase\\images\\file2"));
            fos = new FileOutputStream(new File("javase\\images\\file"), true); // append

            // 2.写数据
//        fos.write(97); // 97=a

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);

            byte[] bys = {97, 98, 99, 100, 101};
//        fos.write(bys);
            fos.write(bys, 1, 3); // bcd
            fos.write("\r\n".getBytes());
            fos.write("end".getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 3.释放资源
            if (fos != null) {
                try {
                    fos.close(); // 没有释放，文件不能删除
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
