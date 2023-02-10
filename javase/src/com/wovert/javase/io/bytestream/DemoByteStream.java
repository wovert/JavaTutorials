package com.wovert.javase.io.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteStream {
    public static void main(String[] args) {
//        byteStreamOutput();
        byteStreamInput();
    }

    private static void byteStreamInput() {
        FileInputStream fis = null;
        try {
//            System.out.println(2/0);
            fis = new FileInputStream("javase\\images\\file");
//            System.out.println((char)fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());'
            int b;

            while ((b = fis.read()) != -1) {
                System.out.print((char)b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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
