package com.company;

public class ovrrid {
     void aa(){
        System.out.println("Hi");
    }
}
 class Ev extends ovrrid{
     void aa(){
        System.out.println("njcd");
    }

     public static void main(String[] args) {
         Ev e = new Ev();
         e.aa();
     }
}