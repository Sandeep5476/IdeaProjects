package LibraryManagementSystem;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected boolean isAvailable;

    //constructor
    public LibraryItem(String itemId,String title){
        this.itemId=itemId;
        this.title=title;
        this.isAvailable=true; //since it is a boolean type we have to initialise directly
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void borrowItem(){
        if(isAvailable){
            System.out.println(title+" borrowed successfully");
            isAvailable=false;
        }
        else{
            System.out.println(title+" is not available.");
        }
    }
    public void returnItem(){
       isAvailable=true;
       System.out.println(title+" returned successfully");
    }
    public void showDetails(){
        System.out.println("Id: "+itemId+"\nTitle: "+title+"\nAvailable: "+isAvailable);
    }
}
