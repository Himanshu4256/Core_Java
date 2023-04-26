package com.company;

class Demos {
    Demos()
    {
        this(10,20); // call 2 perameter constructor
        System.out.println("Default constructor");
    }
    Demos(int a){
        System.out.println("Permeterised Constructor");
    }
    Demos(int a ,int b)
    {
        this(10); // call 1 perameter constructor
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Demos O = new Demos();
//        com.company.Demos O1 = new com.company.Demos(10); -> enke bina hi perameter wale constructor call ho rahe hai main mai ni bnane pde.
//        com.company.Demos O2 = new com.company.Demos(11,12);
    }
}
