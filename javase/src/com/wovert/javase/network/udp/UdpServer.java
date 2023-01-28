package com.wovert.javase.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        // 找码头
        DatagramSocket ds = new DatagramSocket(10000);

        // 找新箱子
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 接受礼物并放入新箱子中
        System.out.println("-------------------接受前-阻塞--------------");
        ds.receive(dp);
        System.out.println("-------------------接受后--------------");

        // 从箱子中获取礼物
//        byte[] data = dp.getData();
        int len = dp.getLength();
//        System.out.println(new String(data, 0, len));
        System.out.println(new String(bytes, 0, len));

        // 拿完
        ds.close();
    }
}
