package at.aau.itec.esop18.lesson06;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {12, 42, 13, 14, 60};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " -> " + arr[i]);
            sum += arr[i];
            System.out.println("Aktuelle Summe -> " + sum);
        }
        System.out.println("Durchschnitt ist " + (sum/arr.length));
    }
}
