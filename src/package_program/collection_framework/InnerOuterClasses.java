package package_program.collection_framework;

public class InnerOuterClasses {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner(); // Inner class ka object bnane ka way
        in.show();
        out.mth();
    }
}
class Outer{

    class Inner{
        public void show(){
            System.out.println("nested class");
        }
    }
    void mth(){
        System.out.println("Himanshu");
    }
}
