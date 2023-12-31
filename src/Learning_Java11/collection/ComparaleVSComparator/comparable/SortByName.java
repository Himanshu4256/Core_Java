package Learning_Java11.collection.ComparaleVSComparator.comparable;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().equals(o2.getName())){
            return o1.getMarks() - o2.getMarks();
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
