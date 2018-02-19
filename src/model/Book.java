package model;

public class Book {

    private Author author;
    private String title;
    private Publisher publisher;
    private String type;
    private int publicationYear;
    private int isbn;
    private double price;

    public Book(Author author, String title, Publisher publisher,
                String type, int publicationYear, int isbn, double price) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.type = type;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
