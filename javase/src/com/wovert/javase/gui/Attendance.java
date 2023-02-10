package com.wovert.javase.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Attendance {
    public static void main(String[] args) {
        showJFrame();
    }

    private static void showJFrame() {
        JFrame jf = new JFrame();

        jf.setTitle("考勤查询");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);


        JLabel dateLabel = new JLabel("考勤日期");
        dateLabel.setBounds(50, 20, 100, 20);
        jf.add(dateLabel);

        JLabel startTimeLabel = new JLabel("开始时间");
        startTimeLabel.setBounds(50, 70, 100, 20);
        jf.add(startTimeLabel);

        JLabel endTimeLabel = new JLabel("结束时间");
        endTimeLabel.setBounds(250, 70, 100, 20);
        jf.add(endTimeLabel);

        DateChooser startDateChooser = DateChooser.getInstance("yyyy/MM/dd");
        DateChooser endDateChooser = DateChooser.getInstance("yyyy/MM/dd");

        JTextField startTimeField = new JTextField();
        startTimeField.setBounds(50, 100, 100, 20);
        startDateChooser.register(startTimeField);
        jf.add(startTimeField);

        JTextField endTimeField = new JTextField();
        endTimeField.setBounds(250, 100, 100, 20);
        endDateChooser.register(endTimeField);
        jf.add(endTimeField);


        JButton okBtn = new JButton("确定");
        okBtn.setBounds(250, 180, 60, 20);
        jf.add(okBtn);

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了确定按钮~");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

                String startString = startTimeField.getText();
                String endString = endTimeField.getText();

                try {
                    Date startDate = sdf.parse(startString);
                    Date endDate = sdf.parse(endString);

                    JOptionPane.showMessageDialog(jf, startDate + "\n" + endDate);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jf.setVisible(true);

    }
}
