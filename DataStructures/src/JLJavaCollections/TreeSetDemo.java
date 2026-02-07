package JLJavaCollections;

import java.util.Comparator;
import java.util.TreeSet;

class Book /*implements Comparable<Book>*/{   //implement comparable interface to avoid castClassException
    String author,title;
    int bookId;
    Book(String author,String title,int bookId){
        this.author=author;
        this.bookId=bookId;
        this.title=title;
    }

    @Override
    public String toString() {
        return title+" "+bookId+" "+author;
    }


//    @Override
//    public int compareTo(Book that) {    //comparing all the variables
//        int titleCompare = this.title.compareTo(that.title);
//        if (titleCompare != 0) {
//            return titleCompare;
//        }
//
//        int idCompare = Integer.compare(this.bookId, that.bookId);
//        if (idCompare != 0) {
//            return idCompare;
//        }
//
//        return this.author.compareTo(that.author);
//    }

}
public class TreeSetDemo {
    public static void main(String[] args) {
        //defining byOwn comparator
        Comparator<Book> byTitle = (b1,b2)->b1.title.compareTo(b2.title); //based on title
        TreeSet<Book> set = new TreeSet<>(byTitle);
        Book b1 = new Book("Sandeep","aptitude book",1);
        Book b2 = new Book("Sandeep1","english",2);
        Book b3 = new Book("Sandeep2","urdu",3);
        Book b4 = new Book("Sandeep","aptitude book",1);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        System.out.println(set);

    }
}
