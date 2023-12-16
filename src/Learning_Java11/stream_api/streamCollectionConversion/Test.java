package Learning_Java11.stream_api.streamCollectionConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Q");
        Student s2 = new Student(102,"P");

        List<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);

        // converting List to Map Using Streams
        //Map<id,Student>
        Map<Integer,Student> map = list.stream().collect(Collectors.toMap(Student::getId, student->student));
        System.out.println(map);


    }
}
