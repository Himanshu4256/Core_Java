package Learning_Java11.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Al {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(15);
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        //changing the element
        al.set(2,"Element changed");
        // Traversing List Through for-each loop
        for (String s:al) {
            System.out.println(s);
        }
        //sorting the list
        Collections.sort(al);

        // Removing Specific element from list
        al.remove("D");
        al.remove(0);

    }
}
