package com.company;

class Overiding {
    public void show(){
        System.out.println("Show Parent");
    }
}
class Dynamic extends Overiding{
    @Override
    public void show(){
        System.out.println("Show Child");
    }
    void  mth(){

    }

    public static void main(String[] args) {
        Dynamic d = new Dynamic();
        d.show();
        Overiding o = new Overiding();
        o.show();

        Overiding o1 = new Dynamic(); //[yha Dynamic Polymorphism Archive Ho rha hai kyoki reference Parent ka pass kiya
                                        // Hai to phle ye parent m shoew mth ko dekhega phir child k Obect hai to usme jaega aur O/P "Show Child" Print krega.
        o1.show();
    }
}
