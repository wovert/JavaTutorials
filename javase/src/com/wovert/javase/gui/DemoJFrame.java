package com.wovert.javase.gui;

import javax.swing.*;

public class DemoJFrame {
    public static void main(String[] args) {
        JFrameDemo1();
    }

    private static void JFrameDemo1() {
        JFrame jf = new JFrame(); // 一个最初不可见的新窗体

        jf.setTitle("第一个窗体标题");

        jf.setVisible(true); // 显示或隐藏窗体

        jf.setSize(800, 600); // 窗体大小

        jf.setLocationRelativeTo(null); // 居中位置

        jf.setAlwaysOnTop(true); // 此窗体始终在其他窗体之上

        jf.setDefaultCloseOperation(3); // 窗体关闭时退出应用程序



        JButton btn = new JButton("登录");
//        btn.setSize(100, 20);
//        btn.setLocation(100, 100);
        btn.setBounds(100, 100, 100, 20);
        jf.add(btn);

        JButton btn2 = new JButton("注册");
        btn2.setBounds(250, 100, 100, 20);
        jf.add(btn2);

        JLabel jLabel = new JLabel("标签名称");
        jLabel.setBounds(100, 50, 100, 20);
        jf.add(jLabel);

        JLabel jLabel2 = new JLabel(new ImageIcon("javase\\images\\bitcoin.jpg"));
        jLabel2.setBounds(0, 0, 353, 300);
        jf.add(jLabel2);

        jf.setLayout(null); // 取消窗体的默认布局

    }
}
