package com.company;

public class Value_Initilization {
    int age;
    int salary;
    String name;
    static String companyName;

    {
        age = 18;
        salary = 30000;
        name = "Rajkumar";
        System.out.println("init block");
    }

    static
    {
        companyName = "DUCAT";
        System.out.println("static init block");
    }

    public static void main(String[] args) {
        Value_Initilization d1 = new Value_Initilization();
        System.out.println("age :"+d1.age);
        System.out.println("salary :"+d1.salary);
        System.out.println("name :"+d1.name);
        System.out.println("companyName :"+d1.companyName);
    }
}