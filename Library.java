import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("New patron registered: " + patron.getName());
    }

    public Book searchBookByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

    public void checkoutBook(String title, Patron patron) {
        Book book = searchBookByTitle(title);
        if (book != null && book.isAvailable()) {
            patron.borrowBook(book);
            System.out.println("Book checked out: " + book.getTitle() + " by " + patron.getName());
        }
    }

    public void returnBook(String title, Patron patron) {
        Book book = searchBookByTitle(title);
        if (book != null) {
            patron.returnBook(book);
            System.out.println("Book returned: " + book.getTitle() + " by " + patron.getName());
        }
    }
}