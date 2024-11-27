package library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final String userId;
    private final List<Book> borrowedBooks;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return name + " (ID: " + userId + ")";
    }
}