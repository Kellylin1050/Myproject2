package com.kelly.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
//fields
//constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        JLabel label = new JLabel("Zzzzz");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("hihi");
                label.setText("hello~");
            }
        });
        label.setText("aaa");
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);
    }
    //methods
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        /*guessFrame.setSize(400,300);
        guessFrame.setVisible(true);*/
    }
}
