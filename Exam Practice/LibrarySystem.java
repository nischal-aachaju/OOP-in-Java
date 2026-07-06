class Book {
    int bookid;
    String title;
    String author;
    int availableCopies;

    public void addBook(int id,String name,String author,int availableCopies){
        this.bookid=id;
        this.author=author;
        this.title=name;
        this.availableCopies=availableCopies;
    }

    public void borrowBook(){
       if(this.availableCopies!=0){
        this.availableCopies=this.availableCopies-1;
       }
       else{
        System.out.println("Book unavailable");
       }
    }

    public void returnBook(){
        this.availableCopies++;
    }
}

class Users{
    int userid;
    String name;
    public  Users(int id,String name){
        this.userid=id;
        this.name=name;
    }
    public void borrowBook(Book b){
        System.out.println(this.name+" is borrowing "+ b.title);
        b.borrowBook();
    }
    public void retuenBook(Book b){
        System.out.println(this.name+" returned the "+b.title+" book");
        b.returnBook();
    }

}


public class LibrarySystem {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.addBook(1, "hello", "oii", 1);

        Users u1=new Users(1,"Nischal");
         Users u2=new Users(2,"Nirjal");
          Users u3=new Users(3,"Norman");
        u1.borrowBook(b1);
        // u1.retuenBook(b1);
        u2.borrowBook(b1);
        u2.borrowBook(b1);        
    }
}
