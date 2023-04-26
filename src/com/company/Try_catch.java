package com.company;

public class Try_catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is :"+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason :");
            System.out.println(e);
        }
    }
}
