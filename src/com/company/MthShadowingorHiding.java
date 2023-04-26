package com.company;

class Mth {
    static public void display()
    {
        System.out.println("Display Parent");
    }
}

class Shadowing extends Mth{
    static public void display()
    {
        System.out.println("Display Child");
    }

    public static void main(String[] args) {
        Mth s = new Shadowing();
        s.display(); // This is Doubt - Ky ni Call Ho rha
    }
}