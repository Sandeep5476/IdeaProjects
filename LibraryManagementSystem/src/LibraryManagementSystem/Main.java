package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        //create Library items
        Book b1 = new Book("java0001","head first java","kathy sierra");
        Magazine m1 = new Magazine("Mag001","AI Evolution",11);

        //create Users
        Student s1 = new Student("5476","Sandeep");
        Professor p1 = new Professor("555","Jenny");

        //Borrow item
        s1.borrow(b1);

        //show details
        s1.showBorrowedItems();
    }
}
