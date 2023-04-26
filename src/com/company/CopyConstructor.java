package com.company;

public class CopyConstructor {

    int a; String b;
    CopyConstructor(){
        a=10;
        b="Himanshu Sharma";
        System.out.println(a+" "+b);
    }
    CopyConstructor(CopyConstructor ref) //Class type ka ref pass kiya
    {
       int c = ref.a;
       String d = ref.b;
        System.out.println(c+" "+d);
    }
}
class Second {
    public static void main(String[] args) {
        CopyConstructor t = new CopyConstructor();
        CopyConstructor t2 = new CopyConstructor(t);
    }
}

//O/P - dono mai same values aaengi.
