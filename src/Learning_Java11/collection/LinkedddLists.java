package Learning_Java11.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedddLists {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add( "ABZ");
        ll.add("ABZ");
        ll.add("Sharma");
        ll.add(3111);
        ll.add(128.9); // it is heterogeneous
        ll.add("ABZ"); // can contain similar data
        ll.add("AbZ");
        System.out.println("Before First Add :"+ll);
        System.out.println("After Add=======");
        ll.addFirst("Hitesh");
        ll.addLast("Rupal");
        System.out.println("After adding first & last first :"+ll);
        ll.removeFirst();
        ll.removeLast();
        ll.removeFirstOccurrence("ABZ"); // first(right) se jo phle ABZ milega use remove krega
        ll.removeLastOccurrence("ABZ"); // last(left) se jo phle ABZ milega use remove krega


        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator i = ll.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //System.out.println(ll);

    }
}
