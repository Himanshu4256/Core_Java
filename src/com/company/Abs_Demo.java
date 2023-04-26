package com.company;

abstract public class Abs_Demo {
    abstract void Abs_Demo();
}
class Demo2 extends Abs_Demo{
    void Abs_Demo(){
        System.out.println("Abs_Demo Method");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.Abs_Demo();
    }
}
