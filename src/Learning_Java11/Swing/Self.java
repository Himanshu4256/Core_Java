package Learning_Java11.Swing;
import java.awt.*;
public class Self extends Frame{

    Self(){
    Label l = new Label("Name");
    l.setBounds(90,70,50,30);
    add(l);


    TextField t = new TextField();
    t.setBounds(140,120,100,30);
    add(t);
    Label l2 = new Label("Password");
    l2.setBounds(70,120,100,30);
    add(l2);

    TextField t2 = new TextField();
    t2.setBounds(140,70,100,30);
    add(t2);

    Button b = new Button("Submit");
    b.setBounds(120,180,100,30);
    add(b);

    setSize(450,400);
    setTitle("Self Practice");
    setLayout(null);
    setVisible(true);

    }

    public static void main(String[] args) {
        new Self();
    }

}
