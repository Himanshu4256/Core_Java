package Learning_Java11.CoparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorProductMain {
    public static void main(String[] args) {
        List<Products> ls = new ArrayList<>();
        ls.add(new Products(1,"productOne","anyTitle"));
        ls.add(new Products(3,"productOne","anyTitle"));
        ls.add(new Products(2,"productOne","anyTitle"));

        Collections.sort(ls,new ProductsComparator());
        System.out.println(ls);

        List<Products> ls1 = new ArrayList<>(ls);
        Collections.sort(ls,new NameComparator());
        System.out.println(ls);
    }
}
