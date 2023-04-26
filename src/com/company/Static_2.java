package com.company;

public class Static_2 {
    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        Static_2 d1 = new Static_2();
        Static_2 d2 = new Static_2();
        System.out.println(d1.a);
        System.out.println(d1.b);

        d1.a = 90;
        d1.b = 95;

        System.out.println(d1.a);
        System.out.println(d1.b);

        System.out.println(d2.a);
        System.out.println(d2.b); // Jab Ham 1st obj mai value change krte hai to (STATIC k case mai second Obj ki value bhi change hoti hai.)


    }
}
