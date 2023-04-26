package Learning_Java11;

public class Variable_Hiding {
     int a = 3;

}
class Hide  {
    int a = 5; // ye var Hiding hai bcoz ye apne class k var ko hi call kr rha hai jbki name same hai.
    public static void main(String args[]) {
        Hide h = new Hide();
        System.out.println(h.a);
    }
}