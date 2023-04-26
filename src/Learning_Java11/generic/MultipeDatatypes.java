package Learning_Java11.generic;

import package_program.exception_handling.Test;

class Tests<T,U> {
    T obj1;
    U obj2;

    //constructor
    Tests(T obj1,U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        Tests<Double,String> ob1 = new Tests(4.8d,3.2d);
        System.out.println(ob1);
    }
}

