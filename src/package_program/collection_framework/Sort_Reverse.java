package package_program.collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Reverse {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(66);
        a.add(12);
        a.add(20);a.add(8);
        a.add(100);a.add(80);
        System.out.println("Before Changing :"+a);

        a.add(1,7); // ye change krega 1st index pr 7 value
        System.out.println("After Changing & Bofore sorting:"+a);

        Collections.sort(a);
        System.out.println("After sorting & Before reverse :"+a);

        Collections.reverse(a);
        System.out.println("After reversing :"+a);
        System.out.println("========================================");

        a.add("Abc");
        a.add("Def");
        a.add("Ghi");
        a.add("Jkl");
        System.out.println("List Order :"+a);
        Collections.sort(a);
        System.out.println("List sort :"+a);
        Collections.reverse(a);
        System.out.println("List reverse"+a);



    }
}
