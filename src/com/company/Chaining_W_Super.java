package com.company;

abstract public class Chaining_W_Super {
    int dreamcalc = 3;
    Chaining_W_Super(){
        System.out.println("....A....");
    }
    Chaining_W_Super(int a){
        this.dreamcalc = a;
    }
    abstract void myDream();
}
class Hardworks extends Chaining_W_Super {
    Hardworks(){
        System.out.println("....B....");
}
Hardworks(int a)
{
    super(a);
    System.out.println("....C...."+a);
}

    @Override
    void myDream() {
        System.out.println("....D....");
    }

    public static void main(String[] args) {
        Hardworks h = new Hardworks();
        h.myDream();

        Hardworks s = new Hardworks(8);
        s.myDream();
    }
}