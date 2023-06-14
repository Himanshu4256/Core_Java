package com.company;

public class PrivateMtdAccess {
    private void mth(){
        System.out.println("This is private method");
    }

    public PrivateMtdAccess(){
        System.out.println("first constructor");
    }
}
class Access extends PrivateMtdAccess{
    public Access(){
            // Constructor always super keyword use krta hai.
    }
    public static void main(String[] args) {
        Access a = new Access();
       // a.mth(); private method can not access -- beshak extends kyo a kiya gya ho.


    }
}
