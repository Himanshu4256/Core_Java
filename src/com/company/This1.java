package com.company;

public class This1 {
   static String a="a";


    This1(String a)
    {
        this.a=a;
        System.out.println(this.a);

    }
    public static void main(String[] args) {
        This1 obj=new This1("b");

    }
}