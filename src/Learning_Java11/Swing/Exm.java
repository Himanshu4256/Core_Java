package Learning_Java11.Swing;

import java.awt.*;

public class Exm {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("Name");
        l.setBounds(90,90,100,50);
        f.add(l);

        TextField t = new TextField();
        t.setBounds(90,90,100,50);
        f.add(t);
        Label l2 = new Label("Password");
        l2.setBounds(90,90,100,50);
        f.add(l2);

        TextField t2 = new TextField();
        t2.setBounds(90,90,100,50);
        f.add(t2);

        f.setSize(300,400);
        f.setTitle("Self Practice");
    }
}
