package com.company;

public class Super_Method {
    void disp()
    {
        System.out.println("Parent");
    }
}
    class s2 extends Super_Method{
        void disp(){
            System.out.println("com.company.Child");
        }
        void abhishek()
        {
            disp(); //own class disp call
            super.disp();  // parent class disp call
        }

        public static void main(String[] args) {
            s2 o = new s2();
            o.abhishek();
        }
    }

