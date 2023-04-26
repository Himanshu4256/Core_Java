package com.company;

public class Demox {
    String name;
    String serial;
    float income;

    Demox()
    {
        name = "undefine";
        serial  = "undefined";
        income = 1110000.0f;
    }
    Demox(String name,String serial, float income)
    {
        this.name= name;
        this.serial = serial;
        this.income = income;
    }

    public static void main(String[] args) {
        Demox d = new Demox();
        System.out.println(d.name);
        System.out.println(d.serial);
        System.out.println(d.income);

        Demox d1 = new Demox("Tata","SVZ",1000000000.5f);
        System.out.println(d1.name);
        System.out.println(d1.serial);
        System.out.println(d1.income);
    }
}
