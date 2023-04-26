package com.company;
// Jab Bhi Ham Static krke Variable ko Import krte hai Tab Hme Class k saat Var ko bhi import krna pdta hai. gvn Below

import static java.lang.Integer.SIZE;
public class Static_Var_Import {
    public static void main(String[] args) {
        System.out.println(SIZE); // we can't change the value of SIZE bcoz ese java n final Bna rkha hai.
    }
}


//import static java.lang.Integer.SIZE;
//import static java.lang.Byte.SIZE;
//Sout(SIZE);
//Ans- Gives error bcoz there is conflict ki SIZE kiska call krna Hai ?