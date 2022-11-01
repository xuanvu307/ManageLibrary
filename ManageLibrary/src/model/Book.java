package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String subject;
    private int numberOfBook;

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String name, String subject, String author, int numberOfBook) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.numberOfBook=numberOfBook;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    @Override
    public String toString() {
        return "Book:" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", numberOfBook=" + numberOfBook +
                "\n";
    }
}
