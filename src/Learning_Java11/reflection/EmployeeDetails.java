package Learning_Java11.reflection;

public class EmployeeDetails extends Employee
{
    public String publicAddress = "Noida";
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
