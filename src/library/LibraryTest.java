package library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", "1234567890");
        Book book2 = new Book("Python for Beginners", "Jane Smith", "0987654321");

        User user1 = new User("Alice", "U001");
        User user2 = new User("Bob", "U002");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addUser(user1);
        library.addUser(user2);

        library.borrowBook(user1, book1);
        library.borrowBook(user2, book2);

        library.displayAllLoans();

        library.returnBook(user1, book1);
        library.displayAllLoans();
    }
}
