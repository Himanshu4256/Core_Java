package com.company;

abstract class Base {
    public Base(){
        System.out.println("Mai Base class ka Constructor Hu");
    }
    public void sayHello(){ //non abstract method
        System.out.println("Hello");
    }
     abstract public void greet(); // abstract method in abstract class ye usi mthod k aage likho jiski body na ho.
     abstract public void greet1();
}
class Derive extends Base{
    @Override
    public void greet(){ // upr wale abstract greet mthod ko update kr rha hai
        System.out.println("Good Morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good Evening");
    }
}
abstract class Child extends Base{ // we can't access abstract class's method in non abstract class. So u Must Make it abstract
    public void hs(){
        System.out.println("I'm Good");
    }
}
public  class Abstract {
    public static void main(String[] args) {
       // Base b = new Base();       Base class is abstract So we can't create object of Base class
       Derive d = new Derive();
       // Child c = new Child();    Child class is abstract So we can't create object of Child class
        d.greet();
        d.greet1();

        Base d1 = new Derive(); // Ham es trh se abstruct class ka object bhi bna skte hai.
        d1.greet();
       }
    }
