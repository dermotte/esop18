package at.aau.itec.esop18.lesson12;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetFun {
    public static void main(String[] args) {
        HashSet s1 = new HashSet();
        HashSet s2 = new HashSet();

        s1.add("apple");
        s1.add("banana");
        s1.add("cherry");

        s2.add("cherry");
        s2.add("peach");

        System.out.println("# s1: ");
        s1.forEach(o -> System.out.println(o));
        System.out.println("# s2: ");
        s2.forEach(o -> System.out.println(o));

        // set union
        Set union = new HashSet(s1);
        union.addAll(s2);
        System.out.println("# union: ");
        union.forEach(o -> System.out.println(o));
        // set intersection
        System.out.println("# intersection: ");
        HashSet s1_without_s2 = new HashSet(s1);
        s1_without_s2.removeAll(s2);
        s1.removeAll(s1_without_s2);
        s1.forEach(o -> System.out.println(o));

    }
}
