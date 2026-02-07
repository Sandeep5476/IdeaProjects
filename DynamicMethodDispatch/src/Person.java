public class Person {
   protected String name;
   //Constructor
    public Person(String name){
        this.name=name;
    }
    public void displayDetails(){
        System.out.println("I am person and my name is: "+name);
    }
    public void greet(){
        System.out.println("Person greet HI");
    }
}
