package Learning_Java11.collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectoor {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");

//        v.clear();
        Iterator<String> iitr = v.iterator();
        while (iitr.hasNext()){
            System.out.println(iitr.next());
        }
    }
}
