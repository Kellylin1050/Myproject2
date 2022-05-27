package com.kelly.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //fields
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("?");
    JTextField number = new JTextField(10);
    //constructors
    public GuessFrame() {
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Random r = new Random();
        int secret = r.nextInt(10)+1;
        System.out.println("secret:" + secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("hihi");
                //label.setText("hello~");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                    if (secret > num) {
                        label.setText("bigger");
                    } else {
                        if (secret < num) {
                            label.setText("smaller");
                        } else {
                            label.setText("Bingo , the secret number is " + secret);

                        }
                    }

                }
        });

        //label.setText();
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    //methods
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
    /*guessFrame.setSize(400,300);
        guessFrame.setVisible(true);*/
    }

