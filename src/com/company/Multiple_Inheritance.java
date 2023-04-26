package com.company;

public interface Multiple_Inheritance{
    public abstract void mth();
}
interface A5{
    public abstract void mth();
}
interface A7 extends Multiple_Inheritance,A5{

}
class Doem implements A7 {
    public void mth(){
        System.out.println("my mth");
    }

    public static void main(String[] args) {
        Doem d = new Doem();
        d.mth();
    }
}
