package at.aau.itec.esop18.lesson03;

public class PyramidText {
    public static void main(String[] arg) {

        int i = 10;
        while (i-- > 0) {
            int j = 0;
            while (j++ < i) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
