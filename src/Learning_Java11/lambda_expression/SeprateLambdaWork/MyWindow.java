package Learning_Java11.lambda_expression.SeprateLambdaWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        // window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close krne pr close ho jae

        //create button & add Jframe
        JButton button = new JButton("Click me");




        //button click krne per niche wala chalega using Normally
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//                JOptionPane.showMessageDialog(null,"Hey, Button click");
//            }
//        });

        // using lambda
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Hey, Button click");
        });





        frame.add(button);

        frame.setVisible(true);
    }
}
