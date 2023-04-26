package com.company;

class A {
    public A(){
        System.out.println("Constructor A");
    }
}
class B extends A
{
    public B(){

       // super();// ye by default lgta hi Hai.
        // But Ham this(); ka use krte hai to this hi chalega super nahi chalega.
        //DOUBT- jab constrtr lgaya to super kyo work kr rha hai.
        this(8);
        System.out.println("Constructor B");
    }
    public B(int a){
        System.out.println("Constructor C");
    }
}

class C {
    public static void main(String[] args) {
        B d = new B();
    }
}