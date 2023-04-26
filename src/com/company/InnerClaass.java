package com.company;

class OuterClass {
    int x = 10;


    class InnerClass {
        int y = 5;
    }
}
public class InnerClaass{
    public static void main(String[] args) {
        OuterClass Outer = new OuterClass();
        //InnerClaass inner = new InnerClaass();

        OuterClass.InnerClass Iclass = Outer.new InnerClass();

        System.out.println(Outer.x + Iclass.y);
    }
}