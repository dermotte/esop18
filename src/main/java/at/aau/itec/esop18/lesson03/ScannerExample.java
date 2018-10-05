package at.aau.itec.esop18.lesson03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 1;
        int sum = 0;
        do {
            input = s.nextInt();
            // if (input == 0) break;
            sum = sum + input;
            System.out.println("input = " + input);
        } while (input !=0 );
        System.out.println("sum = " + sum);
    }
}
