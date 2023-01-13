package com.wovert.javase.gui;

import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);


        JLabel noticeLabel = new JLabel("系统产生一个1-100之间的数字，请猜一猜");
        noticeLabel.setBounds(70, 50, 350, 20);
        jf.add(noticeLabel);

        JTextField numberField = new JTextField();
        numberField.setBounds(120, 100, 150, 20);
        jf.add(numberField);

        JButton guessBtn = new JButton("我猜");
        guessBtn.setBounds(150, 150, 100, 20);
        jf.add(guessBtn);

        jf.setVisible(true);

    }
}
