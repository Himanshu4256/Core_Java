package com.company;

class Employees {
    int id;
    static String comName;
    String name;

    void setid(int i){
        id = i;
    }
    int getid(){

        return id;
    }
    void setcomName(String c){
        comName = c;
    }
    String getcomName(){
        return comName;
    }

    void setName(String c){
        name = c;
    }
    String getName(){
        return name;
    }


    public static void main(String[] args) {
        Employees d1 = new Employees();
        Employees d2 = new Employees();

        d1.setid(1);
        System.out.println(d1.id);
        int a = d1.getid();
        System.out.println(a);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");

        d1.setName("PK");
        d1.setcomName("PK");
        d1.setid(1);
        System.out.println(d1.getName());
        System.out.println(d1.getcomName());
        System.out.println("d1.id :"+ d1.getid());

    }
}
