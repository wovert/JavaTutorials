package com.wovert.javase.file;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        file();

        createNewDir();
        createNewFile();

//        deleteFile();

        otherFile();

        cursiveFile();

    }

    private static void cursiveFile() {

        String path2 = "D:\\development\\JavaTutorials\\javase\\images\\dir";
        File file2 = new File(path2);

        File[] files = file2.listFiles();
        for (File p: files) {
            System.out.println(p);
        }
    }

    private static void otherFile() {
        String path = "D:\\development\\JavaTutorials\\javase\\images\\createfile";
        File file1 = new File(path);

        String path2 = "D:\\development\\JavaTutorials\\javase\\images\\dir";
        File file2 = new File(path2);

        System.out.println(file1.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file1.getName());
        System.out.println(file2.getName());
    }

    private static void deleteFile() {
        String path = "D:\\development\\JavaTutorials\\javase\\images\\createfile";
        File file1 = new File(path);
        boolean s = file1.delete();
        System.out.println(s);
    }

    private static void createNewDir() {
        String path = "D:\\development\\JavaTutorials\\javase\\images\\dir";
        File file1 = new File(path);
        boolean status = file1.mkdir();
        System.out.println(status);


        String path2 = "D:\\development\\JavaTutorials\\javase\\images\\dir\\files";
        File file2 = new File(path2);
        boolean status2 = file2.mkdirs();
        System.out.println(status2);
    }

    private static void createNewFile() throws IOException {
        String path = "D:\\development\\JavaTutorials\\javase\\images\\createfile";
        File file1 = new File(path);
        System.out.println(file1);

        boolean status = file1.createNewFile();
        System.out.println(status);
    }

    private static void file() {
        String path = "D:\\development\\JavaTutorials\\javase\\images\\file";
        File file1 = new File(path);
        System.out.println(file1);

        String path1 = "D:\\development\\JavaTutorials\\javase\\images";
        String path2 = "file";
        File file2 = new File(path1, path2);
        System.out.println(file2);

        // 模块下
        String path3 = "javase\\images\\file";
        File file3 = new File(path3);
        System.out.println(file3);

        // 项目下
        String path4 = "images\\file";
        File file4 = new File(path4);
        System.out.println(file4);
    }
}
