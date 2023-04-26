package com.company;

class Empl {

    private Empl Salary;
    private String empName;
    private int empId;
    //rivate int Salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(Empl Salary) {
        this.Salary = Salary;
    }

    public Empl getEmp() {
        return Salary;
    }

    public static void main(String[] args) {
        Empl e = new Empl();

        e.setEmpName("vishal");
        e.setEmpId(3);
        e.setEmp();

        System.out.println("Name :" + e.getEmpName());
        System.out.println("ID :" + e.getEmpId());
        System.out.println("Salary :" + e.getEmp());

    }

    private void setEmp() {
    }

}

