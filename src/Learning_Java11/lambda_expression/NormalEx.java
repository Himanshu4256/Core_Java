package Learning_Java11.lambda_expression;

import java.util.ArrayList;

public class NormalEx {
    public static void main(String[] args) {
        int a = 100;
        ArrayList n = new ArrayList();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(a);

        for(Object value : n){ int i = (Integer)value;
            System.out.println("int value :"+value);
        }
    }
}
