package LibraryManagementSystem;

public class Student extends User{

    //constructor
    public Student(String userId,String name){
        super(userId,name);
    }

    @Override
    public void borrow(LibraryItem item){//instanceof book magazine
      if(item instanceof Book){
          super.borrow(item);
      }
      else{
          System.out.println("Students can borrow only books.");
      }
    }
}
