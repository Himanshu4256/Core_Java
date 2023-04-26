package com.company;

//Interview Question - we have one com.company.Person class inside that we have attributes with - name + age
//        now we want to set the value for both attributes & display with Anonymous object. how to set?

// sol with Anonymous object
class Person {
    String name;
    int age;

    Person setAge(int age){
        this.age = age;
        return this; // return currentobject
    }

    void  getAge()
    {
        System.out.println("Ur age is :"+age);
    }

    Person setName(String name){
        this.name = name;
        return this;
    }

    Person getName()
    {
        System.out.println("Hello "+name+", Welcome's U ");
        return this;
    }

    public static void main(String[] args) {
        new Person().setName("Himanshu").setAge(20).getName().getAge();
    }
}
