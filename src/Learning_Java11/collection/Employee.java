package Learning_Java11.collection;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    int salary;


    public Employee(){ }

    public Employee(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" +name+ ", salary=" +salary;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals....");
        Employee t = (Employee)obj;
        return t.name == this.name;
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode");
        return id; // ye uniqueness provide krta hai Array mai jase yha id = 12 hai to ye id,name,salary ko "12" index pr store kr dega.
    }
}
