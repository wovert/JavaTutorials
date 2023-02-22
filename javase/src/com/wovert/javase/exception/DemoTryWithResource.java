package com.wovert.javase.exception;

import java.io.FileReader;

public class DemoTryWithResource {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("d:/file.txt");) {
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            char c3 = (char)reader.read();
            System.out.println(""+c+c2+c3);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
