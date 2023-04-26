package com.company;

public class Static_Block {
    static int count;

    static
    {
        System.out.println("static init-1"); // ye static hai to bina obj,class to ye bina obj & class k call ho jaega.
        count=15;
    }

    {
        System.out.println("3");
    }
    int age;
    {
        age = 18;
        System.out.println("1");
    }
    {
        System.out.println(2);
    }
    static{
        System.out.println("static init-2"); // ye static hai to bina obj,class to ye bina obj & class k call ho jaega.
        count=12;
    }

    static void check(){
        count++;
        System.out.println("Database.check() Method call");
    }

    public static void main(String[] args) {
        System.out.println(Static_Block.count); // ye firstly callin k saat count m value 15 lega. USKE BAAD niche aakr use chnge krke 12 kr dega.
        Static_Block.check(); // check method call using class Name.


        Static_Block d1 = new Static_Block(); // Obj, default m normal Vars ko call krega.

        d1.check(); // Again check method call using object
        System.out.println("End!!!");
    }
}
