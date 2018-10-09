package at.aau.itec.esop18.lesson04;

public class SimpleForLoop {

    public static void main(String[] args) {
        for (int i = 0; i<= 10; i += 1) {
            if (i % 2 == 0)
                System.out.println("i = " + i*10);
        }
    }
}
