package at.aau.itec.esop18.lesson05;

public class BinomialCoefficient {
    public static void main(String[] args) {
        long n = 10, k = 8;
        long binCoeff = factorial(n)/
                (factorial(k)*factorial(n-k));
        System.out.println("binCoeff = " + binCoeff);
    }

    static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
