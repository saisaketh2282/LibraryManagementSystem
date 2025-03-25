public class LibraryManagementSystem
{
    public static void main(String[] args) {
        Library library = new Library();
        Patron patron = new Patron("Vishnu", "P123");
        Book book = new Book("Java in 30 days", "saketh", "123456", 2025);

        library.addBook(book);
        library.registerPatron(patron);
        library.checkoutBook("Java in 30 days", patron);
        library.returnBook("Java in 30 days", patron);
    }
}
