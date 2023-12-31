package Learning_Java11;
// interface always contain method body.
// JDk 8 se phle interface 100% abstraction tha But after jdk 8 we can add concrete method in interface.
public interface Concrete_Mtd_Intrfce {
    int PI = 0;
    void add (int a, int b); // yha error dega agr body lgaye to
    static void cal(int a, int b) // yha body lgane se error ni de rha bcoz [STATIC] Lgaya hai.
    {
        System.out.println("THIS IS STATIC METHOD IN INTERFACE");
        int c = a*b;
        System.out.println("Calculation is :"+c);
    }
    default void div(int a, int b) // [default] only works in interface not classes, yha body lgane se error ni de rha bcoz [DEFAULT] Lgaya hai.
    {
        System.out.println("THIS IS DEFAULT METHOD IN INTERFACE");
        int c = a/b;
        System.out.println("Division is :"+c);
    }

}
interface Contract extends Concrete_Mtd_Intrfce{
    void wel();
    default void defaultMethod(){
        System.out.println("default method in interface 2");
    }
    void add(int a,int b);
}


// Support Multiple Inheritance
class Contract1 implements Concrete_Mtd_Intrfce,Contract{
    public void wel(){
        System.out.println("Welcome to my concrete method in interface para");
    }
    public void add(int a, int b){
        int c = a+b;
        System.out.println("Addition is :"+c);
    }
}
class Runner {
    public static void main(String[] args) {
        Contract1 c = new Contract1();
        c.add(2,3);
        c.wel();
        c.defaultMethod();
        c.div(10,5);
//        Concrete_Mtd_Intrfce.cal(8,8);

    }
}
