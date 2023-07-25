package Learning_Java11.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {
    public static void main(String[] args) {
        List<String> n = new LinkedList<>();
        n.add("Welcome");
        n.add("to");
        n.add("Ducat");

        //Getting ListIterator
        System.out.println("-------------- ListIterator ----------------");
        ListIterator<String> names = n.listIterator();
        //Traversing elements using next() method
        while (names.hasNext()){
            System.out.println(names.next());
        }

        // for-each loop also creates Internal Iterator here.
        System.out.println("-------------- for-each loop ----------------");
        for (String s : n) {
            System.out.println(s);
        }

    }
}
