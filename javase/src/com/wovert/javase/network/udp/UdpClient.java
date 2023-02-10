package com.wovert.javase.network.udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 找码头
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            // 打包礼物
            String data = sc.nextLine();
            if ("886".equals(sc)) {
                break;
            }
            byte[] bytes = data.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            // 发送包裹
            ds.send(dp);
        }

        // 付钱
        ds.close();
    }
}
