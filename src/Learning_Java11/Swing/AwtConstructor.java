package Learning_Java11.Swing;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class AwtConstructor {
    AwtConstructor() {
        // creating a Frame
        Frame f = new Frame();

        // creating a Label
        Label l = new Label("Employee ID:");

        //creating a Button
        Button b = new Button("Submit");

        //creating a TextField
        TextField t = new TextField();

        //setting position of above components in the frame
        l.setBounds(20,80,100,30);
        t.setBounds(20,110,80,30);
        b.setBounds(100,110,80,30);



        //adding components in frame
        f.add(l);
        f.add(b);
        f.add(t);

        //frame size 300 width & 300 height
        f.setSize(400,300);

        //setting the title of frame
        f.setTitle("Employee info");

        //no Layout
        f.setLayout(null);

        //set Visibility of Frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtConstructor(); //This is Obj & call the constructor
    }
}
