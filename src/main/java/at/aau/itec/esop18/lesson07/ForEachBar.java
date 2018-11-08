package at.aau.itec.esop18.lesson07;

import java.util.Arrays;

public class ForEachBar {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        for (int k : numbers) {
            k++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
