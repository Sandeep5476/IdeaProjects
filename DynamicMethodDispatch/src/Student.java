public class Student extends Person{
   private int rollNo;
   //constructor
    public Student(String name,int rollNo){
        super(name);
        this.rollNo=rollNo;
    }
    public void displayDetails(){
        System.out.println("I am student with name: "+name+" and rollNo is: "+rollNo);
    }
    //not in the reference method
    public void work(){
        System.out.println("I am working on a project");
    }
}
