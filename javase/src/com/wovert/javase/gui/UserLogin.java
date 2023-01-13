package com.wovert.javase.gui;

import javax.swing.*;

public class UserLogin {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {
        JFrame jf = new JFrame();

        jf.setTitle("用户登录");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);


        JLabel userNameLabel = new JLabel("用户名");
        userNameLabel.setBounds(50, 50, 50, 20);
        jf.add(userNameLabel);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(150, 50, 180, 20);
        jf.add(userNameField);

        JLabel passwordLabel = new JLabel("密码");
        passwordLabel.setBounds(50, 100, 50, 20);
        jf.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);


        JButton loginBtn = new JButton("登录");
        loginBtn.setBounds(50, 200, 280, 20);
        jf.add(loginBtn);

        jf.setVisible(true);

    }
}
