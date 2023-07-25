package Learning_Java11.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList num = new ArrayList();
        num.add(4);
        num.add(12);
        num.add(8);
        num.add(13);
        num.add(16);

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) // hasNext() - if iterator m value hai
        {
            Integer i = it.next(); // next() - return element and move to next element
            if (i<10){
                it.remove();
            }
        }
        System.out.println(num);

    }
}
