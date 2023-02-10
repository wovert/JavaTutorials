package com.wovert.javase.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 主机名：机器名称或者IP地址
        InetAddress address = InetAddress.getByName("bitsmart");
        System.out.println("主机名=" + address.getHostName()); // hostname
        System.out.println("IP地址" + address.getHostAddress()); // ip
    }
}
