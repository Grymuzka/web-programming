package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<User> users;
    private final List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(User user, Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not available in the library.");
            return;
        }

        if (user.getBorrowedBooks().contains(book)) {
            System.out.println("User already borrowed this book.");
            return;
        }

        user.borrowBook(book);
        Loan loan = new Loan(book, user, LocalDate.now());
        loans.add(loan);
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(User user, Book book) {
        if (!user.getBorrowedBooks().contains(book)) {
            System.out.println("User did not borrow this book.");
            return;
        }

        user.returnBook(book);
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getUser().equals(user)) {
                loan.returnBook(LocalDate.now());
                System.out.println("Book returned successfully.");
                return;
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void displayAllLoans() {
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}