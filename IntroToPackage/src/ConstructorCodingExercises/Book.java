package ConstructorCodingExercises;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){
        this("Unknown","Unknown");
//        this.title="Unknown";
//        this.author="Unknown";
        this.price=200;
        System.out.println("No argument constructor is being called");
    }
    public Book(String title,String author){
        this(title,author,500);
//        this.title=title;
//        this.author=author;
        System.out.println("Two argument constructor is being called");
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price = price;
        System.out.println("Three argument constructor is being called");
    }
    public void displayDetails(){
        System.out.println("Book title: "+this.title);
        System.out.println("Book author: "+this.author);
        System.out.println("Book price: "+this.price);
    }
}
