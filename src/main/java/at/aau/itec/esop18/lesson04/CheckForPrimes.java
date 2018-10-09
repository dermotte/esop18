package at.aau.itec.esop18.lesson04;

public class CheckForPrimes {
    public static void main(String[] args) {
        long numCalculations = 0;
        for (int i = 3; i <= 10000; i=i+2) {
            // for each i, check if it is prime!!!
            boolean isPrime = true;
            for (int j = 2; j < i && isPrime; j++) {
                if (i%j == 0) {
                    isPrime = false;
                }
                numCalculations++;
            }
            if (isPrime)
                System.out.println("prime number " + i);

        }
        System.out.println("numCalculations = " + numCalculations);

    }
}
