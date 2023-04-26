package com.company;

public class TestA {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && (j == 3)) break ;
                // if(i==2 && (j==3)) break outer;
                System.out.println(i + " " + j);
            }
        }
    }}
