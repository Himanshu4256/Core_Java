package com.company;

public class ovrling1 {

}

class chis extends ovrling1{

}
class Tests extends chis{
    void mth(chis c){
        System.out.println("Child");
    }
    void mth(ovrling1 m){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        TestA t = new TestA();
        //t.mth(null); ambiguity
        // Doubt extend krne pr abiguity nahi dena chahiye But yha de rha hai O/P Child Hona chahiye.
    }
}
