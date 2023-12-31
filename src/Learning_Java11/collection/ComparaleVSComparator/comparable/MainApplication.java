package Learning_Java11.collection.ComparaleVSComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(74,"Joe"));
        students.add(new Student(75,"Joe1"));
        students.add(new Student(76,"Joe2"));
        students.add(new Student(77,"Joe3"));
        students.add(new Student(78,"Joe4"));

        Collections.sort(students); // sort on the basis of Marks.

        students.forEach(System.out::println);

    }
}
