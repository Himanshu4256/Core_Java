package Learning_Java11.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        
        //Q) Create a List and Filter all even numbers from list [with and without STREAM]

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(34);
        list1.add(23);
        list1.add(65);

        //new way
        List<Integer> list2 = Arrays.asList(34,55,66,88,57);

        //without stream
        List<Integer> listeven = new ArrayList<>();
        for (Integer i:list1) {
            if (i%2==0){
                listeven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listeven);


        //Using stream API
        Stream<Integer> stream = list1.stream();
        List<Integer> newlist = stream.filter(i->i%2 == 0).collect(Collectors.toList());
        System.out.println(newlist);

        //OR

        List<Integer> newlist2 = list1.stream().filter(i->i>35).collect(Collectors.toList());
        System.out.println(newlist2);

    }
}
