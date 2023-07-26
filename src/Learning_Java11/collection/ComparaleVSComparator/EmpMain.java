package Learning_Java11.collection.ComparaleVSComparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Praveen","34738274",12));
        emps.add(new Emp("Praveen1","46435",10));
        emps.add(new Emp("Praveen2","2344",33));
        System.out.println(emps);


        //Comparable
//        Collections.sort(emps);
//        System.out.println(emps);

        //comparator
        Collections.sort(emps,new IdComparator());
        System.out.println(emps);

        ArrayList<Emp> e2 = new ArrayList<>(emps);
        Collections.sort(e2,new NameComparator());
        System.out.println(e2);


    }
}
