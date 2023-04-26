package com.company;

public class Normal_var {

    // Ham normal variable k andr, variable access kr skte hai.
    void temp(){
        System.out.println("temp");
    }
    void sum(){
        temp();
        System.out.println("sum");
    }

    public static void main(String[] args) {
        Normal_var d1 = new Normal_var();
        d1.sum(); // ek method calling se temp,sum both print ho rahe hai...
    }
}
