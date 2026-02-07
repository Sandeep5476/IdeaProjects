//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//in inheritance fields are not inherited and static methods are not inherited it treat as separate methods
public class Main {
    public static void main(String[] args) {
         Person obj1 = new Person("sandeep","india");
         obj1.display();
         //creating object for employee sub class
         Employee emp1 = new Employee("gowtham","software engineer");
         emp1.display();
         //different creation of object
        Person p1 = new Employee("sandeep","software engineer");
        p1.display();//invokes display method in employee
        }
    }
