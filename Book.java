public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isCheckedOut;
    public Book(String t, String a, String isbn){
        this.title = t;
        this.author = a;
        this.ISBN = isbn;
        this.isCheckedOut = false;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public boolean isCheckedout(){
        return isCheckedOut;
    }
    public void checkOut(){
        isCheckedOut = true;
    }
    public void returnBook(){
        isCheckedOut = false;
    }

}
