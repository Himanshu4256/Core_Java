package com.company;

public class Constructor_1 {
    int a =10;

    Constructor_1(){
        a = 1000;
        System.out.println("Normal com.company.Constructor");
    }

    Constructor_1(int a){
        this.a = a;
        System.out.println("Peramitrized");
    }

    public static void main(String[] args) {
        Constructor_1 d1 = new Constructor_1();
        System.out.println(d1.a);
        Constructor_1 d2 = new Constructor_1(10 );
        System.out.println(d2.a);
    }
}
