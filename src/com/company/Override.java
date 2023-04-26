package com.company;

import static java.lang.System.*;
class Ovrrid extends Object{
    int a = 5;

    void show(){
        System.out.println("HImanshu");
    }
    @Override
        public String toString(){
        return ("Coffee");
    }

    public static void main(String[] args) {
        Ovrrid d1 = new Ovrrid();
        d1.show();
        out.println("Hello"+d1);
    }
}
