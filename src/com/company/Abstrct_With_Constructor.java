package com.company;

abstract public class Abstrct_With_Constructor {
    Abstrct_With_Constructor(){
        System.out.println("My Dream Constructor");
    }
    abstract void myDream(); // called Signature
}
class Hardwork extends Abstrct_With_Constructor{
   Hardwork() // ye by default parent class k constructor ko call krta hai. Agr default diya h to default and parameterized hai to parameterized ko call krega.
   {super();  // ye lgao ya ni work krega hi.
       System.out.println("Hard Work");
   }
   void myDream(){
       System.out.println("My Dream");
   }

    public static void main(String[] args) {
        Hardwork h = new Hardwork();
        h.myDream();
    }
}
/*
Execution :- firstly compiler object k constructor pr aaega aur wo apni class ke default constructor ko call krega.
             fir [default constructor] extend class k [default constructor] ko call krega. aur uske content ko print krega.
             Phir wo return aagea local class k constructor pr aur usme jo Hoga use print kr dega.
             Uske Baad return bapas Obj wale constructor pr aaega .
             After that wo object k reference var k pass jaega aur myDream Method ko call krega...
 */