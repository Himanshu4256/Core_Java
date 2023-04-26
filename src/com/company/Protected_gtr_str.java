package com.company;

class Student {
    private String name;
    private int rollNumber;

    int getRollNumber(){
        return  rollNumber;
    }
    void setRollNumber(int rollNumber) //throws IllegalAccessException
    {
        if (rollNumber<=0){
           // throw new IllegalAccessException("Invalid Args");
            System.out.println(1/0);
        }
        this.rollNumber = rollNumber;
    }


    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }

    public static void main(String[] args) //throws IllegalAccessException
    {
        Student st = new Student();
//        st.name("com.company.A");
        st.setRollNumber(-1);
        st.name="Himanshu";
        st.display();
    }
}
