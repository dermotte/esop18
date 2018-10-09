package at.aau.itec.esop18.lesson04;

public class CharTest {
    public static void main(String[] args) {
        char a = (char) (64);

        for (int i = 0; i <200; i++) {
            System.out.println((char) (a + i));
        }
    }
}
