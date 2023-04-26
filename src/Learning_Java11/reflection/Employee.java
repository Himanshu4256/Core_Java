package Learning_Java11.reflection;

public class Employee {
    public String companyName;
    private String name;
    private int age;
    private int salary;
    private int sum;

    public Employee(){
        System.out.println("const..");
    }

    public Employee(String name, int age, int salary){
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    private void test(){
        System.out.println("testing private method");
    }
    @Override
    public String toString() {
        return "Employee [name=" +name+ ", age=" + age +",salary=" +salary + "]";
    }

    public  void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
