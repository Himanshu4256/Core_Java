package Learning_Java11;

@FunctionalInterface
interface Demo {
    void meth1();
}
public class Lambda {
    public static void main(String[] args) {
        Demo obj = ()->{
            System.out.println("I'm method 1 from this lambda");
        };
        obj.meth1(); // with any extra class we can run meth1() mthd.
    }
}