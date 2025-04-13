//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter: THe Philosopher's Stone", "JK Rowling", "123456");
        Book book2 = new Book("Percy Jackson and the Olympians: The Lightning Thief", "Rick Riordan", "789032");
        Book book3 = new Book("Hunger Games", "Suzanne Collins", "837953");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.checkOutBook("123456");
        library.returnBook("123456");
        library.checkOutBook("837953");
    }
}