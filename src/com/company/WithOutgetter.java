package com.company;

public class WithOutgetter {
    String name;
    String comname;
    int id;

    void setname( String name)
    {
       this.name=name;
    }


//    String getName()
//    {
//        return name;
//    }


    void setComname(String comname)
    {
        this.comname = comname;
    }

//    String getComname()
//    {
//        return comname;
//    }

    void setId(int id){
        this.id=id;
    }


//    int getId()
//    {
//        return id;
//    }


    void printCdetail(){
        System.out.println("Name :"+name+"," +" "+"comname :"+comname+"," +" "+"ID :"+id);
    } // Using com.company.This not need to Apply geter method

    public static void main(String[] args) {
        WithOutgetter d1 = new WithOutgetter();

        d1.setname("Himanshu");
        d1.setComname("Google");
        d1.setId(4);
        d1.printCdetail(); // method call

//        d1.setname("HImanshu");
//        d1.setComname("Google");
//        System.out.println(d1.getName());
//        System.out.println(d1.getComname());
        //System.out.println(d1.getId(5));
    }
}