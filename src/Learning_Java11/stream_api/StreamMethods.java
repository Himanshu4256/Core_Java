package Learning_Java11.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //(1) filter(Predicate) ye filter krega value ko linke e>10 or not
        //Predicate means boolean value function - ye true ya false return krega condition k base per

        // (2) map(Function) - it returns value

        //Q- Select names in List which are starts from A character(filter)
        List<String> names = Arrays.asList("Aman","Ankit","Abhinav","Vaibhav");
        List<String> newNames = names.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        //Q - Select numbers from List & Square all number Using (map)
        List<Integer> numbers = Arrays.asList(6,7,8);
        List<Integer> squareNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(squareNumbers);

        //forEach() Method uses the collection's,stream iterator
        names.stream().forEach(
                e -> {
                    System.out.println(e);
                }
        );

        System.out.println("--------------------------------------");
        //sort,min,max function
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("--------------------------------------");
        Integer intgr = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(intgr);

        System.out.println("--------------------------------------");
        Integer intgr2 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(intgr2);
    }

}
