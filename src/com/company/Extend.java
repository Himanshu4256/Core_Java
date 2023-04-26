package com.company;

public class Extend {
    static
    {
        System.out.println("Static com.company.Extend class");
    }
    {
        System.out.println("com.company.Extend initializer block");
    }
    Extend(){
        System.out.println("com.company.Extend class constructor");
    }
    void disp(){
        System.out.println("com.company.Extend class Method");
    }
}
class BB extends Extend{
    static
    {
        System.out.println("Static com.company.BB class");
    }
    {
        System.out.println("com.company.BB initializer block");
    }
    BB(){
        System.out.println("com.company.BB class constructor");
    }
    void disp(){
        System.out.println("com.company.BB class Method");
    }
}
class CC extends BB{
    static
    {
        System.out.println("Static com.company.CC class");
    }
    {
        System.out.println("com.company.CC initializer block");
    }
    CC(){
        System.out.println("com.company.CC class constructor");
    }
    void disp(){
        System.out.println("com.company.CC class Method");
    }

    public static void main(String[] args) {
        CC d1 = new CC();
        d1.disp();   //Method alwys Local class ka hi call hoga. mmthod always call down to top.
    }
}
