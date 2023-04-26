package Learning_Java11;

class Otr
{
    int x = 100;
    class Inner{
        void f1(){
            System.out.println("Non static inner class "+x); // inner class can access the members of outer class.
        }
    }

   static class Inner2{
        void f2(){
            System.out.println("Static inner class"); // HERE we can't use outer class member. in this U can Make static outer class
        }
    }
}

public class NonStaticInnercls{
    public static void main(String[] args) {
        Otr Out = new Otr();  // non static innr class m outer class ka bhi object bnana pdta hai.
        Otr.Inner o1 =Out.new Inner();
        o1.f1();

        // Now we create static class object
        Otr.Inner2 n = new Otr.Inner2();
        n.f2();

    }
}



