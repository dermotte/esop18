package at.aau.itec.esop18.lesson04;

public class HarmonicSequence {
    public static void main(String[] arg) {
        float sum = 0;
        int n = 1000000000;
        for (int i = n; i > 0; i--) {
            sum += 1.0 / i;
        }
        System.out.println("sum = " + sum);
    }

}
