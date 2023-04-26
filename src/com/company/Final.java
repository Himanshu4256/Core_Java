package com.company;

public class Final {
    //final keyword we can not use same method name in Different class
    int a;

    final void disp(){
        System.out.println("Hi i'm final method of parent class!!!");
    }
}
class Childz extends Final{
//    void disp(){                     }
//        System.out.println("");      } -> Can't override bcoz of 'final'
//    }                                }
    public static void main(String[] args) {
        Childz d1 = new Childz();
        System.out.println(d1.a);

    }
}
