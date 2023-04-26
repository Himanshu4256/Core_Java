package com.company;

public interface Interrrfacess {
    void print();
}
class A1 implements Interrrfacess{
    public void print() // public declare krna padega bcz... interface maethod ko by default public, abstract leta hai.
    {
        System.out.println("Methods are public and abstract in Interface");
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        obj.print();
    }
}
