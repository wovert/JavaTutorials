package com.wovert.javase.io.bytestream;

import java.io.*;

public class DemoFileCopy {
    public static void main(String[] args) {
        String path = "javase\\images\\Git-2.38.1-64-bit.exe";
//        String path = "javase\\images\\file";
        String target = "javase\\images\\Git-2.38.1-64-bit-copy.exe";
        File file = new File(path);
        File targetFile = new File(target);

        // 读取书
        FileInputStream fis = null;
        // 写数据
        FileOutputStream fos = null;
        try {
            if (!targetFile.exists()) {
                boolean status = targetFile.createNewFile();
                System.out.println(status);
            }

            fis = new FileInputStream(file);
            fos = new FileOutputStream(targetFile);

            // 字节缓冲输入流 底层创建8192的字节数组
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 字节缓冲输出流 底层创建8192的字节数组
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            // 每次读取一个字节
//            int c;
//            while((c = fis.read()) != -1) {
//                fos.write(c);
//            }

            // 每次读取指定大小读取
//            byte[] bytes = new byte[1024];
//            int len; // 本次读取的有效个数-读了几个字节
//            while((len = fis.read(bytes)) != -1) {
//                fos.write(bytes, 0, len);
//            }

            // 利用缓冲流, 内存中输入缓冲流8192的数组中读取 1个字节复制到输出缓冲流的数组中
//            int c;
//            while((c = bis.read()) != -1) {
//                bos.write(c);
//            }

            // 利用缓冲流, 内存中输入缓冲流8192的数组中读取1024字节复制到输出缓冲流的数组中
            byte[] bytes = new byte[1024];
            int len;
            while((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0, len);
            }

        } catch(IOException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
