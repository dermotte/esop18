package at.aau.itec.esop18.lesson10;

public class Book extends Article {
    String author, title;

    public Book(double price, long id) {
        super(price, id);
    }

    public Book(double price, long id, String author, String title) {
        super(price, id);
        this.author = author;
        this.title = title;
    }

    public void print() {
        System.out.println(id + " (Book) " + author + " " + title + " " + price);
    }
}
