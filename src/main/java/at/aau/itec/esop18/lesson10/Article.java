package at.aau.itec.esop18.lesson10;

public class Article {
    double price;
    long id;

    public Article(double price, long id) {
        this.price = price;
        this.id = id;
    }

    public void print() {
        System.out.println(id + " " + price);
    }
}
