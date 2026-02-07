package ConstructorInheritance;

public class Employee extends Person{
    private String empId;
    private float salary;

    //default constructor
//    public Employee(){
//        super("sandeep");
//        System.out.println("employee  default constructor is being called");
//    }

    //2 argument constructor
    public Employee(String name,String empId,String address){
        super(name,address);
        this.empId=empId;
        System.out.println("Employee constructor with 2 arguments is being called "+name+" "+empId);
    }
    public String getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+getName()+"\nAddress: "+getAddress()+"\nempId: "+empId;
    }
}
