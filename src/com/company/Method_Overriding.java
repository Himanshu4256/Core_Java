package com.company;

class Aq {
    public int himanshu(){
        return 8;
    }
    public void math(){
        System.out.println("com.company.This is Method 2 of class com.company.A");
    }
}
class Bq extends Aq{
    @Override
    public void math(){
        System.out.println("com.company.This is Method 2 of class com.company.B");
    }

    public static void main(String[] args) {
        Aq a = new Aq();
        Bq b = new Bq();

        a.math();
        b.math();
    }
}