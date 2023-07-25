package Learning_Java11.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDirections {
    public static void main(String[] args) {
        List<String> l = new LinkedList();
        l.add("learn");
        l.add("from");
        l.add("ducat");

        ListIterator<String> names = l.listIterator();
        //Traversing element
        System.out.println("Forward Direction Iteration:");
        while (names.hasNext()){
            System.out.println(names.next());
        }

        //Traversing element
        System.out.println("Backward Direction Iteration:");
        while (names.hasPrevious()){
            System.out.println(names.next());
        }

    }
}
