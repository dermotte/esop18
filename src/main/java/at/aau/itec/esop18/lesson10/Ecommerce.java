package at.aau.itec.esop18.lesson10;

public class Ecommerce {
    public static void main(String[] args) {
        Article[] shop = new Article[3];
        shop[0] = new Book(1.99, 1, "William Gibson", "Neuromancer");
        shop[1] = new Book(2.99, 1, "Iam M. Banks", "The City in the Sky");
        shop[2] = new CD(3.99, 1, "Wil Wheaton", "My Life in Star Trek");

        for (int i = 0; i < shop.length; i++) {
            Article article = shop[i];
            article.print();
        }
    }
}
