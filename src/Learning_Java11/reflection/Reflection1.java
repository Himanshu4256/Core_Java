package Learning_Java11.reflection;

import java.lang.reflect.Method;

class Parent{

}
class Rohit extends Parent {
    public void show(){

    }
}
public class Reflection1 {
    public static void main(String[] args) {
        Rohit r = new Rohit();
        Class c = r.getClass();
        String name = c.getName();
        System.out.println("Class Name : "+name);
       // Method s[] = c.getMethods(); // gives all methods like String,Object etc..
        Method methods[] = c.getDeclaredMethods(); // Gives Declrative Methods which only declare only this class
        for(Method m:methods){
            System.out.println("Method Name : "+m.getName());
        }

        Class superclass = c.getSuperclass();
        System.out.println("Super class Name : "+superclass.getName());

    }
}
