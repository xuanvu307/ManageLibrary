package model;

import java.time.LocalDate;

public class TicketBook {
    private Reader reader;
    private Book book;
    private LocalDate fromDate = LocalDate.now();                   // khỏi tạo mặc định ngày mượn
    private LocalDate toDate = fromDate.plusDays(30);              // ngày trả bằng ngày mượn + 30 ngày

    public TicketBook() {
    }

    public TicketBook(Reader reader, Book book) {
        this.reader = reader;
        this.book = book;
    }

    public TicketBook(Reader reader, Book book, LocalDate fromDate, LocalDate toDate) {
        this.reader = reader;
        this.book = book;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "reader=" + reader +
                ", book=" + book +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate  +
                "\n";
    }
}
