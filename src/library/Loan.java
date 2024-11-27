package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Loan {
    private final Book book;
    private final User user;
    private final LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(Book book, User user, LocalDate loanDate) {
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public void returnBook(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public long getLoanDuration() {
        return ChronoUnit.DAYS.between(loanDate, Objects.requireNonNullElseGet(returnDate, LocalDate::now));
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    @Override
    public String toString() {
        return book + " loaned by " + user + " from " + loanDate + (returnDate != null ? " returned on " + returnDate : "");
    }
}
