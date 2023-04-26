package com.company;

class Super {
    int s = 10;
}
class Parent extends Super
{
    int p = 20;
}
class Childs extends Parent
{
    int c = 30;
    int d;
}
class Runner {
    public static void main(String[] args) {
        Super sup = new Super();
        System.out.println(sup.s);
       //  System.out.println(sup.c); Cant't Possible
        Super c = new Childs();
        System.out.println(c.s);

     //  Childs a = (Childs) sup; // Exception
        Super a = c;
        System.out.println(a); //ye c ka referenc elega

        Super s = new Super();
        //Parent p = (Parent)s; ye Exception dega Bcz we can't put the value of parent in Child
        //System.out.println(p);

    }
}