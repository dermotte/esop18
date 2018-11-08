package at.aau.itec.esop18.lesson07;

public class SuperFor {
    public static void main(String[] args) {
        int countRuns = 0;
        for (int i = 1; i < 100; i = i << 1) {
            System.out.println("i = " + i);
            countRuns++;
        }
        System.out.println("countRuns = " + countRuns);
    }
}
