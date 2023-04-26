package com.company;

public class Object5 {
    static int a = 0;
    {
        a++;
        System.err.println(a);
        while(a==5){
            System.out.println(1/0);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {

        Object5 d1 = new Object5();
        Object5 d2 = new Object5();
        Object5 d3 = new Object5();
        Object5 d4 = new Object5();
        Object5 d5 = new Object5();
        Object5 d6 = new Object5();

    }
}
