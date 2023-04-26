package com.company;

class Paren{
    void show(){
        System.out.println("Show");
    }
}
class Chld extends Paren{
    void wow(){
        System.out.println("Wow");
    }
    void show(){
        System.out.println("Child Show");
    }
}
class CastingEx{
    public static void main(String[] args) {
        Paren p = new Chld();  // UPCASTING
        p.show(); // yha aap sirf reference var jis class ka hai use cls ka mth hi use kr skte hai
        Chld c = (Chld)p;  // ab yha es reference se dono classes k mth ko access kr skte hai. ye downcasting se hota hai.
        c.show();
        c.wow();


        Paren d = (Paren) new Chld(); // sortcut esse bhi child ka mth call kr skte hai but override k case mai. ye bhi Up,Down Casting kr rha hai.
        d.show();

    }
}