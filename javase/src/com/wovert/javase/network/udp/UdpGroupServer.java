package com.wovert.javase.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UdpGroupServer {
    public static void main(String[] args) throws IOException {
        // 找码头
        MulticastSocket ms = new MulticastSocket(10000);

        while (true) {
            // 找新箱子
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            // 当前计算机绑定一个组播地址
            ms.joinGroup(InetAddress.getByName("224.0.1.0"));

            ms.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();
            System.out.println(new String(data, 0, len));
//            ms.close();
        }
    }
}
