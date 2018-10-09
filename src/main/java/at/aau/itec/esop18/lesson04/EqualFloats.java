package at.aau.itec.esop18.lesson04;

import java.util.Scanner;

public class EqualFloats {
    public static void main(String[] args) {
        float f, g;
        Scanner s = new Scanner(System.in);
        f = s.nextFloat();
        g = s.nextFloat();

        // if (f == g) { // do not use!
        float epsilon = 0.000000000001f;
        if ((f-g)<epsilon) { // best practice
            System.out.println("f und g sind gleich!");
        }
    }
}
