class Book {
    int bookid;
    String title;
    String author;
    int availableCopies;

    public void addBook(int bookid,String title,String author, int availableCopies){
        this.bookid=bookid;
        this.title=title;
        this.author=author;
        this.availableCopies=availableCopies;
    }

    public void borrowBook(){
        if (this.availableCopies >0){
            this.availableCopies--;
            System.out.println("Book booked");
        }
        else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(){
        this.availableCopies++;
    }
}

class users{
int userID;
String name;
    public users(int userID,String name) {
        this.userID=userID;
        this.name=name;
    }

    public void borrowBook(Book b){
        System.out.println(this.name +"is borrowing " +b.title);
        b.borrowBook();
    }

    public void returnBook(Book b){
        System.out.println(this.name +" returned " +b.title);
        b.returnBook();
    }
    
}

public class LibrarySystemO {
public static void main(String[] args) {
    Book b1=new Book();
    b1.addBook(1,"Munamadan","Laxmi",1);
    users u1=new users(1, "Nischal");
    u1.borrowBook(b1);
    u1.returnBook(b1);
    users u2=new users(2, "Samir");
    u2.borrowBook(b1);

}

}
