package com.company;

public class Constructor_2 {
    int a = 10;

    Constructor_2()
    {
        a = 1000;
        System.out.println("Default");
    }
    Constructor_2(int a)
    {
        this.a = a;
        System.out.println("Peramitrized");
    }

    public static void main(String[] args) {
        Constructor_2 d1 = new Constructor_2();
        System.out.println(d1.a);
        Constructor_2 d2 = new Constructor_2(8);
        System.out.println(d2.a);

    }
}
