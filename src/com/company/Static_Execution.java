package com.company;

public class Static_Execution {
    static int a = 80;

    static void show() {
        System.out.println("Parent class");
    }
}
class child extends Static_Execution{
    static int a = 100;

    static void show(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Static_Execution S = new child();
        System.out.println(S.a);
        S.show();

    }
}

