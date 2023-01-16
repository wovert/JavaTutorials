package com.wovert.javase.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {

        String username = "yonghu";
        String password = "123456";

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

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取用户输入的用户名和密码
                String usernameText = userNameField.getText();
                String passwordText = passwordField.getText();

                if (usernameText.length() < 6 || usernameText.length() > 12) {
                    String msg = "用户名的长度是6-12位，请重新输入";
                    System.out.println(msg);
                    JOptionPane.showMessageDialog(jf, msg);
                    userNameField.setText("");
                    return;
                }
                if (passwordText.length() < 6 || passwordText.length() > 12) {
                    String msg = "密码的长度是6-12位，请重新输入";
                    System.out.println(msg);
                    JOptionPane.showMessageDialog(jf, msg);
                    passwordField.setText("");
                    return;
                }
                if (username.equals(usernameText) && password.equals(passwordText)) {
                    String msg = "登录成功";
                    System.out.println(msg);
                    JOptionPane.showMessageDialog(jf, msg);
                    userNameField.setText("");
                    passwordField.setText("");
                } else {
                    String msg = "用户名或者密码有误";
                    System.out.println(msg);
                    JOptionPane.showMessageDialog(jf, msg);
                }
            }
        });
        jf.setVisible(true);

    }
}
