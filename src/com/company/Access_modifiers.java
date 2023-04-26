package com.company;

class Employee {
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}
public class Access_modifiers {
    public static void main(String[] args) {
        Employee himanshu = new Employee();
//        himanshu.id = 45;
//        himanshu.name = "Himanshu God"; --> Throws an error due to private access modifier.

        himanshu.setName("Himanshu Sharma");
        System.out.println(himanshu.getName());

        himanshu.setId(45);
        System.out.println(himanshu.getId());

    }
}