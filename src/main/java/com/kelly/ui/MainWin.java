package com.kelly.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWin {
    public static void main(String[] args) {
        //GUI
        //swing, javaFX
        ///extension
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(450,250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        //匿名類別Anonymous class，沒有設計類別
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello~");
            }
        });
       //有名字的，設計類別
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        frame.setLayout(new FlowLayout());//流水式，往右邊增加，不夠就往下一列
        // frame.setLayout(new BorderLayout());
        frame.add(button);
        //frame.add(new JButton("Testing"));
        frame.setVisible(true);
        System.out.println("end~");
    }
}
