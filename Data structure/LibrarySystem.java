class book{
    int bookId;
    String title;
    String author;
    int availableCopies;

    public void addNewBook(int bookId,String title,String author,int availableCopies){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.availableCopies=availableCopies;
    }

    public String getName(){
        return title;
    } 

    public void borrowBook(){
        if (this.availableCopies>0){
            this.availableCopies--;
        }
        else{
            System.out.println("Book is not available");
        }
    }
    public void returnBook(){
        this.availableCopies++;
    }
}

class user{
    int userId;
    String name;
    user(int userId,String name){
        this.userId=userId;
        this.name=name;
    }
    public void borrowBooks(book b){
        System.out.println(this.name +" is borrowing "+b.getName());
        b.borrowBook();
    }
    public void returnBook(book b){
        System.out.println(this.name +" is returned "+b.getName());
        b.returnBook();
    }
}
public class LibrarySystem {
public static void main(String[] args) {
        book b = new book();
        b.addNewBook(1, "hello", "ram", 1);
        user u1=new user(1,"Nischal");
        u1.borrowBooks(b);
        u1.returnBook(b);
        user u2=new user(2, "Samir");
        u2.borrowBooks(b);
        u2.returnBook(b);
}
}
