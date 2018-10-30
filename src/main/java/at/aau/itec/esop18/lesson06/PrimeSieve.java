package at.aau.itec.esop18.lesson06;

public class PrimeSieve {
    static int[] primeCandidates = new int[100000000];

    public static void main(String[] args) {
        long ms = System.currentTimeMillis();
        for (int i = 2; i < primeCandidates.length; i++) { // walk through all numbers
            // remove the vielfache of 2
            int factor = 2;
            while (factor*i<primeCandidates.length) {
                primeCandidates[factor*i] = -1;
                factor++;
            }
        }
        ms = System.currentTimeMillis() - ms;
        System.out.println(ms);

        /*for (int i = 0; i < primeCandidates.length; i++) {
            if (primeCandidates[i] > -1) System.out.println(i);

        }*/
    }
}
