package Learning_Java11.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       // list.add("LCD");  --> It gives an error bcoz it is a Integer type.
        list.add(123);


        System.out.println(list);

    }
}
