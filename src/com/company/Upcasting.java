package com.company;

class  ParentA{
    void PrintData() {
        System.out.println("method of parent class");
    }
}

class ChildA extends ParentA {
    void PrintData() {
        System.out.println("method of child class");
    }
}
class UpcastingExample{
    public static void main(String args[]) {

        ParentA obj1 = (ParentA) new ChildA();
        ParentA obj2 = (ParentA) new ChildA();
        obj1.PrintData();
        obj2.PrintData();
    }
}