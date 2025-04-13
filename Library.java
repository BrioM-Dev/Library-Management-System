import java.util.*;
public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
       books.add(book);
        System.out.println("Added: " + book.getTitle());
    }
    public void checkOutBook(String isbn)
    {
        for (Book book : books){
            if (book.getISBN().equals(isbn)) {
                if (!book.isCheckedout()) {
                    book.checkOut();
                    System.out.println("Checked out: " + book.getTitle());
                }else{
                    System.out.println("Book is already checked out: "+ book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }

    public void returnBook(String isbn){
        for (Book book : books){
            if (book.getISBN().equals(isbn)){
                if (book.isCheckedout()){
                    book.returnBook();
                    System.out.println("Returned: " + book.getTitle());
                }else {
                    System.out.println("Book was not checked out: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book was not found with ISBN: " + isbn);
    }
}
