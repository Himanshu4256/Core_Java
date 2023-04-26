package com.company;

class This_Typecasting {
    int a = 1000;
}
class S extends This_Typecasting{
    int a = 100;
    void sum(){
        System.out.println("disp method");
    }
}
class P extends S{
    void sum(){
        System.out.println("Sum");
        System.out.println(super.a);
        System.out.println(((This_Typecasting)this).a); //(((com.company.This_Typecasting)this).a) -> esme hmne This_Typcsting ko Typrecast kiya this mai and usse direct parent 'a' ko call kr liya.
    }

    public static void main(String[] args) {
        P d = new P();
        d.sum();
    }
}
