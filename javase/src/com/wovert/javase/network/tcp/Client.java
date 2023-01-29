package com.wovert.javase.network.tcp;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        Socket socket = new Socket("127.0.0.1", 9999);

        // 字节流 获取IO流
        OutputStream os = socket.getOutputStream();
        os.write("hello你好".getBytes());
        // os.close() // 关闭流，结束下面输入流没有效果
        socket.shutdownOutput(); // 关闭输出流，并写一个结束标记，对socket没有后任何影响

//        InputStream is = socket.getInputStream();
//        int b;
//        while((b = is.read()) != -1) {
//            // 出现乱码
//            System.out.print((char)b);
//        }

        // 输入字节流转换字符串
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 释放资源
        os.close();
        br.close();
        socket.close();
    }
}
