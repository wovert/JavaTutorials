package com.wovert.javase.gui;

import javax.swing.*;

public class DateTime {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {
        JFrame jf = new JFrame();

        jf.setTitle("手机日期和时间显示");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);


        JLabel dateLabel = new JLabel("日期");
        dateLabel.setBounds(50, 50, 100, 20);
        jf.add(dateLabel);

        JLabel dateValueLabel = new JLabel("xxxx年xx月xx日");
        dateValueLabel.setBounds(50, 80, 200, 20);
        jf.add(dateValueLabel);

        JLabel timeLabel = new JLabel("时间");
        timeLabel.setBounds(50, 150, 100, 20);
        jf.add(timeLabel);

        JLabel timeValueLabel = new JLabel("xx:xx");
        timeValueLabel.setBounds(50, 180, 200, 20);
        jf.add(timeValueLabel);


        jf.setVisible(true);

    }
}
