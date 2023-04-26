package com.company;

class Constructor {
    int a = 10;
    Constructor(){
        System.out.println("-----------Demo---------");
    }
    Constructor(int a){
      //  this(); // same name method calling using this keyword.
        System.out.println("---------Welcome---------");
        System.out.println("para"+a);

    }

    public static void main(String[] args) {
        Constructor d1 = new Constructor();
        System.out.println(d1.a);
        Constructor d2 = new Constructor(12);
        System.out.println(d2.a);

    }
}
