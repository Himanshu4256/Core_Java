package Learning_Java11.collection;

import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {
        HashSet<Employee> h = new HashSet<>();
        h.add(new Employee(12,"Guest",11_000));
        h.add(new Employee(12,"Guest2",11_000));
        h.add(new Employee(12,"Guest",11_000));
        System.out.println(h);
    }
}