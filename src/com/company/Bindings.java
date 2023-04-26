package com.company;

public class Bindings {
    void f1(){
        System.out.println("f1 function");
    }
    void f2(){
        System.out.println("f2 function");
    }
}
class B2 extends Bindings
{
    void f3(){
        System.out.println("f3 function");
    }

    public static void main(String[] args) {
        Bindings O = new B2();
        O.f1(); // jis class ka reference hai usi class k methods call honge.
        O.f2();
      //  O.f3(); ese call krane k liye override krani pdagi

    }
}
