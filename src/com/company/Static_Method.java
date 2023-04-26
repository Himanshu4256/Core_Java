package com.company;

class Static_Method{
    int a;
    static int b;

    static void print(){
        System.err.println(b); //Call as -> com.company.Static_Method.b
       // System.out.println(a); --> com.company.This Say Normal Var com.company.Static Method mai Call Ni ho skta.
    }
    void show(){
        System.out.println(b);  //Call as -> d1.b
    }


    public static void main(String[] args) {
        Static_Method.print();

        Static_Method d1 = new Static_Method();
        d1.show();
    }
}