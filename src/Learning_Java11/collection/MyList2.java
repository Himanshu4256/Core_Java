package Learning_Java11.collection;

import java.util.ArrayList;

public class MyList2 {
    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        A.add("1");
        A.add("2");
        A.add("3");
        A.add(new Integer(4)); //type casting in integer ye upr wale ki trh hi hai
        System.out.println(A);

        for(int i=0; i<A.size();i++) // in Array -> .length , In ArrayList -> .size
        {
            Object obj = A.get(i);
//            if(obj instanceof String){
//                int a = Integer.parseInt((String)obj);
//                System.out.println(++a);
//            }
            if(obj instanceof Integer){
               // int v = ((Integer)obj).intValue();
                int v = ((Integer) obj).intValue();
                System.out.println(++v);
            }

        }
    }
}
