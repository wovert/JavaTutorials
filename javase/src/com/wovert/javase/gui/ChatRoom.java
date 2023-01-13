package com.wovert.javase.gui;

import javax.swing.*;

public class ChatRoom {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {
        JFrame jf = new JFrame();

        jf.setTitle("聊天室");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10, 10, 360, 200);
        jf.add(messageArea);

        JTextField messageField = new JTextField();
        messageField.setBounds(10, 230, 180, 20);
        jf.add(messageField);

        JButton sendBtn = new JButton("发送");
        sendBtn.setBounds(200, 230, 70, 20);
        jf.add(sendBtn);

        JButton clearBtn = new JButton("清空聊天");
        clearBtn.setBounds(280, 230, 90, 20);
        jf.add(clearBtn);

        jf.setVisible(true);

    }
}
