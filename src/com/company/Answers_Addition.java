package com.company;

public class Answers_Addition {

    void show()  // void type method
    {
        System.out.println("show");
    }
    int sum()  // int type Method
    {
        int a = 10;
        int b = 10;
        int c = a+b;
        System.out.println("a+b :"+c);
        return c;
    }
    int multi() // int type Method
    {
        int a = 10;
        int b = 10;
        int c = a*b;
        System.out.println("a*b :"+c);
        return c;
    }
    public static void main(String[] args) {
        Answers_Addition d1 = new Answers_Addition();
        d1.show(); // show method call
       int S = d1.sum(); // sum method call
       int M = d1.multi(); // multi method call
       int ans = S+M;
       System.out.println("S+M :"+ans);

    }
}
