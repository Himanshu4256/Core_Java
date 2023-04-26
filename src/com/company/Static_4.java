package com.company;

class Emp {
    int id;
    static String comName;
    String name;

    void setid(int i)
    {
        this.id = i;
    }
    void setName(String n)
    {
        name = n;
    }
    void setComName(String c)
    {
        comName = c;
    }

    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    String getComName()
    {
        return comName;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();

        e1.setName("Himanshu");
        e1.setComName("Sixto");
        e1.setid(18);

        e2.setName("Mayank");
        e2.setComName("Sixto");
        e2.setid(23);

        e3.setName("Gurudesh");
        e3.setComName("Sixto");
        e3.setid(33);

        System.out.println("e1.id :"+e1.getId());
        System.out.println("e1.Name :"+e1.getName());
        System.out.println("e1.comName :"+e1.getComName());
        System.out.println("-----------------------------------");

        System.out.println("e2.id :"+e2.getId());
        System.out.println("e2.Name :"+e2.getName());
        System.out.println("e2.comName :"+e2.getComName());
        System.out.println("-----------------------------------");

        System.out.println("e3.id :"+e3.getId());
        System.out.println("e3.Name :"+e3.getName());
        System.out.println("e3.comName :"+e3.getComName());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //once we change the company name. Then it will apply all the com.company.Objects due to static.
        e3.setComName("TCS");

        System.out.println("e3 Company Name :"+ e3.getComName());
        System.out.println("e2 Company Name :"+ e2.getComName());
        System.out.println("e1 Company Name :"+ e1.getComName());

    }
}
