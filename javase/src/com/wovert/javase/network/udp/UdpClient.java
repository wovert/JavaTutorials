package com.wovert.javase.network.udp;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        // 找码头
        DatagramSocket ds = new DatagramSocket();
        // 打包礼物
        String gift = "打包的礼物";
        byte[] bytes = gift.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        // 发送包裹
        ds.send(dp);

        // 付钱
        ds.close();
    }
}
