package com.company;

public class Overloading {
    // same method name with diff perameter.
    void show()
    {
        System.out.println("go");
    }
    void show(int a)
    {
        System.out.println("Went");
    }
    void show(String s)
    {
        System.out.println("gone");
    }

    public static void main(String[] args) {
        Overloading d1 = new Overloading();
        d1.show();
        d1.show(321);
        d1.show("Summer Time");
    }
}
