package Learning_Java11.collection.ComparaleVSComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMainApplication {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(74,"Marshal"));
        students.add(new Student(75,"Marshal1"));
        students.add(new Student(76,"Marshal "));
        students.add(new Student(79,"Marshal3"));
        students.add(new Student(79,"Marshal4"));

        //NORMAL WAY
//        Collections.sort(students, new Comparator<Student>()  // yha hme new class alg bnane ki jarurt ni padi. here create anonymous class
//        {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getName().equals(o2.getName())){
//                    return o1.getMarks() - o2.getMarks();
//                }
//                else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//        });


        // USING LAMBDA
        Collections.sort(students,(o1,o2) ->o1.getName().compareTo(o2.getName()));

       //2.  Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        students.forEach(System.out::println);

    }
}
