import java.util.ArrayList;
import java.util.List;

class Patron {
    private String name;
    private String patronId;
    private List<Book> borrowedBooks;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.checkout();
        }
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }
}