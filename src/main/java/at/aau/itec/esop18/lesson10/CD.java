package at.aau.itec.esop18.lesson10;

public class CD extends Article {
    String musician, title;
    
    public CD(double price, long id) {
        super(price, id);
    }

    public CD(double price, long id, String musician, String title) {
        super(price, id);
        this.musician = musician;
        this.title = title;
    }

    public void print() {
        System.out.println(id + " (CD) " + musician + " " + title + " " + price);
    }
}
