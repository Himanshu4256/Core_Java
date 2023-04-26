package com.company;

class arguments {
    int sub(int a , int b)
    {
        int c = a-b;
        //System.out.println("a-b :"+c);
        return c;
    }

    public static void main(String[] args) {
        arguments d1 = new arguments();
        int sb = d1.sub(100,10);
        System.out.println("a-b :"+sb);


    }
}
