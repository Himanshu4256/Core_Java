package Learning_Java11.stream_api;

import package_program.stringwork.Str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetStreamObject {
    public static void main(String[] args) {
        //Stream API - Collection process
        //collection / group of object


        // 1. if u want create blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
            // yha ye kuch print nahi krega bcoz ye empty stream hai.
        });

        //2. ham given array m stream se kuch operation perform krte hai.
        String names[] = {"A","E","I","O","U"};

        Stream<String> st = Stream.of(names);
        st.forEach(h -> {
            System.out.print(h);
        });

        //3
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
        IntStream s =  Arrays.stream(new int[]{2,4,6,8}); // anonymous Array
        s.forEach(t ->{
            System.out.println(t);
        });


        //V.Imp Stream for Collection - List,Set

        List<Integer> list = Arrays.asList(34,55,66,88,57);

        Stream<Integer> stream =  list.stream();
        stream.forEach(e ->{
            System.out.println(e);
        });

    }
}
