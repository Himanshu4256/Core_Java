package com.company;

//import java.awt.Color;
//import java.awt.Container;
//import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame();  // Obj JFrame
        JButton b = new JButton("Submit"); //Obj JButton

        b.setBounds(10,10,500,200);
        f.add(b); // Adding button in JFrame(frame).

//        Container contentPane = f.getContentPane();
//        b.addActionListener(e -> contentPane.setBackground(new Color((new Random().nextInt(255)))));


        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);

    }
}