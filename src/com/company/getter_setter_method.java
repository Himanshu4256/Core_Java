package com.company;

class  sort{
   private int id;

    int getid()
    {
        return  id;
    }
     void setid(int i)
     {
         id = i;
     }

     public static void main(String[] args) {
         sort d1 = new sort();
         d1.id=11;
         System.out.println(d1.id);
         d1.setid(7);

         int r = d1.getid();
         System.out.println(r);

     }
}
