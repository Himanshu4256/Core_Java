package com.company;

// Agr static Hta de To method Local call hoga.

class Parents {
    int a = 80;

    void show() {
        System.out.println("Parent class");
    }
}
class ChildC extends Parents{
    int a = 100;

    void show(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Parents S = new ChildC();
        System.out.println(S.a);
        S.show();

    }
}

// agr 1 mai stsic ho & 2 mai default and method name smeho tbb error dega can't override.