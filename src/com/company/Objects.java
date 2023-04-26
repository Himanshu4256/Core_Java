package com.company;

public class Objects {
    int a;
    int b;
    int c = 50;

    public static void main(String[] args) {
        Objects d1 = new Objects();
        Objects d2 = new Objects();

        System.out.println("d1.a :"+d1.a);
        System.out.println("d1.b :"+d1.b);
        System.out.println("d2.a :"+d2.a);
        System.out.println("d2.b :"+d2.b);
        System.out.println("When Value is Not Giving Then Obj Take [0] as a Default Value");

        System.out.println("d1.c :"+d1.c);

        // For Change the Value
        d1.c = 80;
        System.out.println("d1.c :"+d1.c);
        System.out.println("d2.c :"+d2.c);
    }
}


//https://www.youtube.com/watch?v=VLAvr-xh7OU
