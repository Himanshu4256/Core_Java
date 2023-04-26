package com.company;


// sql Date is the oldest Class comparision to util Date class. & it's just like a Y2K problem
import java.sql.Date; //Y2k
public class Sqldate {
    public static void main(String[] args) {
        Date d = new Date(20,1,1);
        //java.sql.Date date=new java.sql.Date();
        System.out.println(d);
    }
}
