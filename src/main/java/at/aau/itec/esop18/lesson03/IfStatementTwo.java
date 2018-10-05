package at.aau.itec.esop18.lesson03;

public class IfStatementTwo {
    public static void main(String[] args) {
        int x = -12;
        int negNumbers = 0, posNumbers = 0;
        if (x < 0) {
            negNumbers++; // increase the number of negatives
            System.out.print(-x);
        } else {
            posNumbers++;
            System.out.print(x);
        }

    }
}
