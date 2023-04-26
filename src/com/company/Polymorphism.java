package com.company;

interface Animals {
    void animals(String animal);

}
class Dog implements Animals{
   public void animals(String s){
       Animals a;
       if(s.equals("Dog"))
       {
           a = new Dog();
       }
        System.out.println(".........Dog ..........");


    }
}
class OX implements Animals {
   public void animals(String a){
        System.out.println("..........OX..........");
    }
    void beast(){
        System.out.println("------OX2------");
    }
}
        class Cow implements Animals{
            @Override
            public void animals(String animal) {
                System.out.println(".........COW.........");
            }


//    void mth2(){
//        System.out.println("Cow Class");
//    }

    public static void main(String[] args) {
        Animals a = new Dog();
        a.animals("AA");

        a = new Cow();
        a.animals("BB");

        a = new OX();
        a.animals("OXx");



        //a.mth(); - we can not call these classes methods
    }
}