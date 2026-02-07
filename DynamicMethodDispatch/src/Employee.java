public class Employee extends Person{
    private String empId;
    public Employee(String name, String empId){
        super(name);
        this.empId=empId;
    }
    public void displayDetails(){
        System.out.println("Hi I am "+name+" an employee with empId "+empId);
    }
}
