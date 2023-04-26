package com.company;

public class Demosp {
    public static void main(String[] args) {
        //for convert hours
        float a = 154;
        float b = a/60;
        float g=Math.round(b*100);
        float h=g/100;
//        System.out.println(g);
        System.out.println(h);

        //for convert min
        int c=(int)b;
        float d=(h-c)*60;

        float z=Math.round(d*100);
        float o=z/100;


        //for convert into second
        int e=(int)d;
        float f =(d-e)*60;
        System.out.println(" Hours :"+(int)h + " Minutes :"+(int)o + " Second :"+(int)f);

    }
}
