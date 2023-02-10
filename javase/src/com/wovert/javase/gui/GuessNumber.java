package com.wovert.javase.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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

        Random r = new Random();
        int randomNum = r.nextInt(100);
        System.out.println(randomNum);

        guessBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int number = Integer.valueOf(numberField.getText().trim()).intValue();
                String n = numberField.getText().trim();
                if (n.equals("")) {
                    JOptionPane.showMessageDialog(jf, "猜的数字不能为空");
                    return;
                }
                try {
                    int number = Integer.parseInt(n);
                    if (randomNum < number) {
                        JOptionPane.showMessageDialog(jf, "你猜的数字大了");
                    } else if (randomNum > number) {
                        JOptionPane.showMessageDialog(jf, "你猜的数字小了");
                    } else {
                        JOptionPane.showMessageDialog(jf, "恭喜你，猜对了");
                    }
                    numberField.setText("");
                } catch (Exception exp) {
                    exp.printStackTrace();
                    numberField.setText("");
                    JOptionPane.showMessageDialog(jf, "请输入1-100之间的数字");
                }

            }
        });

        jf.setVisible(true);

    }
}
