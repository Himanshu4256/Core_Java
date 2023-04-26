package com.company;

public class Blocks {
    int a = 10;
    {
        System.out.println("3");
    }
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Blocks d1 = null;
        new Blocks();

        Blocks d2 = new Blocks();

        Blocks d3 = null;
        new Blocks();
    }
}
