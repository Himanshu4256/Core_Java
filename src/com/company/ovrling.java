package com.company;

public class ovrling {

}

class chi{

}
class Test{
    void mth(chi c){
        System.out.println("Child");
    }
    void mth(ovrling m){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        TestA t = new TestA();
//        t.mth(d);
//         t.mth(null); // Ye ambiguity Problem Dega Bcoz yha ham confuse hai ki kis mth ko call kre


    }
}
