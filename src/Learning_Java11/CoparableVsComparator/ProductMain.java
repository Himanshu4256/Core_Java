package Learning_Java11.CoparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Products> ls = new ArrayList<>();
        ls.add(new Products(1,"productOne","anyTitle"));
        ls.add(new Products(3,"productOne","anyTitle"));
        ls.add(new Products(2,"productOne","anyTitle"));

        Collections.sort(ls);
        System.out.println(ls);
    }
}
