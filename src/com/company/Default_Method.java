package com.company;

public interface Default_Method {
    void draw();
    default void msg(){
        System.out.println("Default method");
    }
}
class R implements Default_Method{
    public void draw(){
        System.out.println("Drawing");
    }
}
class testInterfaceDefault{
    public static void main(String[] args) {
        Default_Method d = new  R();
        d.draw();
        d.msg();
    }
}
