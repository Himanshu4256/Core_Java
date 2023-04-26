package Learning_Java11.Swing;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Checkbox;
public class Constructor2 extends Frame  // Aab yha Hme Frame class ka "object" bnane ki jrurt nahi hai.
{
    //initializing using constructor
    Constructor2(){
        Button b = new Button("Click Me!!");

        // setting button position on screen
        b.setBounds(30,100,90,30);
        add(b);

        Checkbox c = new Checkbox("Java");
        c.setBounds(120,120,90,90);
        Checkbox c2 = new Checkbox("C++",true);
        c2.setBounds(120,130,90,90);
        add(c);
        add(c2);

        // frame size 300 w & 300 h
        setSize(300,300);
        setTitle("AWT Example");


        //no layout manager
        setLayout(null);
        setVisible(true);


    }


    public static void main(String[] args) {
        new Constructor2();
    }
}
