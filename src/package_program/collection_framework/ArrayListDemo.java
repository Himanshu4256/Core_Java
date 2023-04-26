package package_program.collection_framework;

import java.util.ArrayList;
//import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);

//        ArrayList z = new ArrayList();
//        System.out.println(z.isEmpty());

        System.out.println(a);

//        a.addAll(2, Collections.singleton("s"));
//        System.out.println(a);


        a.remove(2);
        System.out.println(a);
        System.out.println(a.size());
        boolean b =  a.isEmpty();
        System.out.println(b);
        boolean c =  a.contains(4); //contains means "4" es list mai hai ki nahi
        System.out.println(c);
        a.removeAll(a); // all data remove
        System.out.println(a.isEmpty());

    }
}
