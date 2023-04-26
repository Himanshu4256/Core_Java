package com.company;

class Static {
    int a;
    static int b;

    public static void main(String[] args) {

       // System.out.println(Static_Variable.a); >> normal var can't call by Class name U shld use Obj for calling this.
        System.out.println(Static.b); //com.company.Static Always call by CLASS name.

        Static d1 = new Static();
        System.out.println(d1.b); //But can also call static by obj. (Not standard)
    }
}
