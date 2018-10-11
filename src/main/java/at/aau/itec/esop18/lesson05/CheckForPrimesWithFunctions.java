package at.aau.itec.esop18.lesson05;

public class CheckForPrimesWithFunctions {
    public static void main(String[] args) {
        for (int i = 3; i <= 10000; i = i + 2) {
            if (isPrime(i))
                System.out.println("prime number " + i);
        }
    }

    /**
     * Checks if the number given as a parameter is prime or not
     * @param i the number to check
     * @return true if i is prime, false otherwise
     */
    static boolean isPrime(int i) {
        boolean isPrime = true;
        for (int j = 2; j < i && isPrime; j++) {
            if (i % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
