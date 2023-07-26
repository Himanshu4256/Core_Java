package Learning_Java11.collection.ComparaleVSComparator;


// ye objects ki sorting krne k liye use hote hai
public class Emp implements Comparable<Emp>{
    private String name;
    private String phone;
    private int empId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        return this.empId-o.empId;
    }
}
