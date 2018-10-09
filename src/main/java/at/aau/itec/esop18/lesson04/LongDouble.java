package at.aau.itec.esop18.lesson04;

public class LongDouble {
    public static void main(String[] args) {
        long l = 1124572457312341241l;
        double d = l; // Gefährliche Stelle! Prüfungsfrage!!!
        System.out.println((long) d - l);
    }
}
