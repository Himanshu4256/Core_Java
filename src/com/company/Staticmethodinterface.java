package com.company;

public interface Staticmethodinterface {
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
class Rctgle implements Staticmethodinterface{
    public void draw(){
        System.out.println("Drawing Rectabgle");
    }
}

class TestInterfacestatic{
    public static void main(String args[]){
        Staticmethodinterface d = new Rctgle();
        d.draw();
        System.out.println(Staticmethodinterface.cube(3));
    }
}