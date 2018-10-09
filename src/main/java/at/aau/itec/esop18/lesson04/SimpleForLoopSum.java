package at.aau.itec.esop18.lesson04;

public class SimpleForLoopSum {

    public static void main(String[] args) {
        int summe = 0; // das ist die Ablage
        for (int i = 1; i <= 10; i = i + 1) {
            summe = summe + (i); // jeden Durchlauf wird das aktuelle i dazugezählt
        }
        System.out.println(summe); // Ausgabe
    }
}
