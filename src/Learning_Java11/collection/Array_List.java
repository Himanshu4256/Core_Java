package Learning_Java11.collection;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
//        System.out.println(l);

        ArrayList<Integer> k = new ArrayList(20); // here we defines own default the capicity
        for(int i =1; i<=20;i++){
            k.add(i);
        }
        System.out.println(k);
    }
}



//public class Array_List {
//    public static void main(String[] args)
//    {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add(null);
//        list.add(0, "A");
//        list.add(3, "B");
//        list.add(1, "C");
//        System.out.println(list);
//    }
//}