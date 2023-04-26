package package_program.collection_framework;
import java.util.ArrayList;

public class DemoAr {
    int a = 100;

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);

        for(Object value:a1) // yha Object type esliye liya hai bcoz ye Multiple datatypes ko Gain kr skta hai.
        {
            int i = (Integer)value;
            System.out.println("----Integer Value----"+i);
        }


    }

}
