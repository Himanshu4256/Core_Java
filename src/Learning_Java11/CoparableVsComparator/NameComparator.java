package Learning_Java11.CoparableVsComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
