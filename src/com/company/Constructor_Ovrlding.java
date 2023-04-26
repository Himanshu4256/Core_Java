package com.company;

public class Constructor_Ovrlding {
    Constructor_Ovrlding(){
        System.out.println("default constructor");
    }
    Constructor_Ovrlding(int a){
        System.out.println("perametrized");
    }
    Constructor_Ovrlding(String a){
        System.out.println("With String");
    }

    public static void main(String[] args) {
        Constructor_Ovrlding d1 = new Constructor_Ovrlding();
        Constructor_Ovrlding d2 = new Constructor_Ovrlding(1);
        Constructor_Ovrlding d3 = new Constructor_Ovrlding("Himanshu");
    }
}
