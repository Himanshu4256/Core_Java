package Learning_Java11.CoparableVsComparator;

import java.util.Comparator;

public class ProductsComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return o1.getpId()-o2.getpId();
    }
}
