package at.aau.itec.esop18.lesson11;

import java.sql.SQLOutput;

public class ExpectionHandling {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[3]);
        } catch (ArithmeticException e) {

        } finally {
            System.out.println("Finally!");
        }
        System.out.printf("End!");
    }
}
