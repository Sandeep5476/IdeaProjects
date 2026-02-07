package LibraryManagementSystem;

public class Magazine extends LibraryItem {
    private int issueNumber;
    //constructor
    public Magazine(String itemId,String title,int issueNumber){
        super(itemId,title);
        this.issueNumber=issueNumber;
    }
    @Override
    public void showDetails(){
        System.out.println("Magazine Id: "+itemId+"\ntitle: "+title+"\nIssue Number: "+issueNumber);
    }
}
