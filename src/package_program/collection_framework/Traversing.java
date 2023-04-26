package package_program.collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Traversing {
    public static void main(String[] args) {
        ArrayList n = new ArrayList();
        n.add("Welcome");
        n.add("To");
        n.add("Dubai");

        //Getting Listiterator
        ListIterator names = n.listIterator();


        // Traversing elements using next() mth
        while (names.hasNext()){
            System.out.println(names.hasNext());
        }
        for(Object s : n){
            System.out.println(s);
        }

        names.add("Welcome");
        names.add("TO");
        names.add("GFG");

        //Collections.sort(names);
    }
}
