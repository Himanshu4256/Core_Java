package com.company;

public class Ovrling2 {

}
class Chi extends Ovrling2{

}
class Myt{
    public void m1(int i, double d){
        System.out.println("first m1");
    }
    public void m1(double d, int i){
        System.out.println("second m1");
    }

    public static void main(String[] args) {
        Myt m = new Myt();
        m.m1(10,10.10);
        m.m1(10.10,10);

       // m.m1(10,20); ambiguity bcoz (1) 10=int & 20 convert to double ese hi same niche hoga to compiler confuse hoga kise call kiya jae.
       m.m1(10.10,10);
    }
}