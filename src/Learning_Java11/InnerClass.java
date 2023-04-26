package Learning_Java11;



// Benifit of inner class - No need to create instance of Outer Class....
class Outer
{
    static class Inner{
        void f1(){
            System.out.println("Inner class method");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner In = new Outer.Inner(); // for static class you have to create inner class instance Like class.
        In.f1();

    }
}