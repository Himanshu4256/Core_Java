package Learning_Java11.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {
    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        A.add("1");
        A.add("2");
        A.add("3");
        A.add(new Integer((4)));
        System.out.println(A);
        ArrayList<Integer> B = new ArrayList<>(20);
        for (int i=0; i<=20; i++){
            B.add(i);
        }

        Iterator<Integer> iterator = B.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            if(value %2 == 0){
                System.out.println(value);
            }
        }

    }
}