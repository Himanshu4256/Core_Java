package com.company;

public abstract class AbstractClass {
    public abstract void demo();


}
class sec extends  AbstractClass{
    @Override
    public void demo(){
        System.out.println("I m abstract mtd body");
    }

    public static void main(String[] args) {
        sec s = new sec();
        s.demo();
    }


}
