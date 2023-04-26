package Learning_Java11.Swing;
// This is the AWT work not the Swing
import java.awt.Frame;
import java.awt.Button;

public class Demo {

    public static void main(String[] args) {
        Frame f = new Frame();
        Button b = new Button("Click Here");

        b.setBounds(130,100,100,40); //x axis, y axis, width, height

        f.add(b); //adding button in JFrame

        f.setSize(400,500);
        f.setLayout(null); //using no layout managers
        f.setVisible(true); //making the frame visible
    }
}
