package at.aau.itec.esop18.lesson09;

import java.util.Arrays;

public class CompareStrings {
    public static void main(String[] args) {
        String[] names = {"zob", "alice", "charly"};

        System.out.println();
        if (names[1].compareTo(names[0]) < 0) { // second one is first
            System.out.println(names[1]);
            if (names[2].compareTo(names[0]) < 0) {
                System.out.println(names[2]);
                System.out.println(names[0]);
            }  else {
                System.out.println(names[0]);
                System.out.println(names[2]);
            }
        } else { // first one first
            System.out.println(names[0]);
            System.out.println(names[1]);
        }

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
