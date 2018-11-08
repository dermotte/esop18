package at.aau.itec.esop18.lesson07;

public class VarScope { // Block A
    static int k = 0;

    public static void main(String[] args) {
        if (true) { // Block B
            int k = 2;
            for (int i = 0; i < 10; i++) { // Block C
                k = 3;
                if (i == 5) { // Block D
                    System.out.println(k);
                }
            }
        }
    }
}
