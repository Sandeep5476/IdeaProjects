public class Employee extends Person{
    private String empId;
    private float salary;
    private String jobTitle;
    //constructors
    public Employee(String name,String jobTitle){
        super(name);
        this.jobTitle=jobTitle;
    }

//    public Employee(String name,String address,String empId){
//        super(name,address);
//        this.empId=empId;
//        System.out.println("Employee constructor with 2 arguments called.");
//    }
    public void display(){
        System.out.println(super.name+" is an employee working as "+jobTitle);
    }
    //below are the getter and setter methods

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
