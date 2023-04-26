package com.company;

public interface Interrrfacess2 {
    int a = 20;
    void show();
}
class A2 implements Interrrfacess2{
    public void show() {
        System.out.println("Class A2");
    }
}
class A3 implements Interrrfacess2 {
    public void show() {
        int a = 25;
        System.out.println("Class A3");
    }
}
class TestInterface{
    public static void main(String[] args) {
        Interrrfacess2 i = new A3();
        i.show();
        System.out.println(i.a);
    }
}

