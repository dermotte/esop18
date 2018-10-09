package at.aau.itec.esop18.lesson04;

public class ForLoopExerciseAdvanced {

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i = i + 1) { // gehen von 1 bis 20
            for (int j = 1; j <= 16; j++) {
                System.out.print("\t" + i*j);
            }
            System.out.println();
        }
    }
}
