package com.company;

public class Multicnvrsn {
    void m(){
        System.out.println("Abc");
    }
}
class Pr extends Multicnvrsn{
    void d(){
        System.out.println("Cba");
    }
}
class ch extends Pr{
    public static void main(String[] args) {
        ch chobj = new ch();
        Multicnvrsn m = chobj; // child ko super m rakh skte hai.

        Pr p = (Pr) m;
        ch f = (ch)m;
        // esi ko niche single line m krke likha hai.
        ch c = (ch)((Pr)m);
        c.m(); // yha hmne child class k through parent class ka method call kra liya.
    }
}