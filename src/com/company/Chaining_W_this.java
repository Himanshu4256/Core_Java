package com.company;

abstract class Chaining_W_this {
    int dreaA = 3;
    int dreaB = 3;
    int dreaC = 3;

    Chaining_W_this(){
        System.out.println("first construtor");
    }
    Chaining_W_this(int a, int b,int c)
    {
        this.dreaA = a;
        this.dreaB = b;
        this.dreaC = c;
        System.out.println("this contr");
    }
    abstract void myDream();
}
class Abc extends Chaining_W_this{
    Abc(int a, int b,int c){
        System.out.println("Abc constructor");
    }
    Abc(){
        super();
        System.out.println("super constr");
    }
    void myDream(){
        System.out.println("This is ur dream");
    }

    public static void main(String[] args) {
        Abc v = new Abc();
        v.myDream();

        Abc x = new Abc(2,3,4);
    }
}
