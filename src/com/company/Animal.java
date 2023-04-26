package com.company;

public interface Animal {
    void animalSound();
    void sleep();

}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig says: wee wee");
    }
   public void sleep(){
        System.out.println("Zzz");
    }
}
class Main{
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
    }
}
