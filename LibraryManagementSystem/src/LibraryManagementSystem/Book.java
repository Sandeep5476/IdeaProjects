package LibraryManagementSystem;

public class Book extends LibraryItem {
    private String author;

    //constructor
    public Book(String itemId,String title,String author){
        super(itemId,title);
        this.author=author;
    }

    @Override
    public void showDetails(){
        System.out.println("Book Title: "+title+" AuthorName: "+author);
    }
}
