package com.wovert.javase.network.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        ServerSocket socket = new ServerSocket(9999);


        System.out.println("等待接受连接");
        // 等待客户端连接 阻塞
        Socket accept = socket.accept();
        System.out.println("连接成功");


//        InputStream is = accept.getInputStream();
//        int b;
//        // read 读取一个字节 阻塞 有结束标记返回-1(客户端os.close()往服务库写结束标记)
//        while((b = is.read()) != -1) {
//            System.out.print((char)b);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while((line = br.readLine()) != null) {
            System.out.print(line);
        }

        System.out.println("继续执行...");
        // 获取输入流
//        OutputStream os = accept.getOutputStream();
//        os.write("你谁呀?".getBytes());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你谁呀?");
        bw.newLine();
        bw.flush();




        // 释放资源
//        is.close();
//        os.close();
        br.close();
        bw.close();
        accept.close();
        socket.close(); // 通过四次挥手协议保证连接终止
    }
}
