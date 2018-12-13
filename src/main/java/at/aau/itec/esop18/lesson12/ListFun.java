package at.aau.itec.esop18.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListFun {
    // todo show iterator interface & itit
    // todo show Comparable interface, person class with age as sorting crit.
    public static void main(String[] args) {
        java.util.List l = new ArrayList();
        l.add(42);
        l.add(7);
        l.add(8);
        Collections.shuffle(l);

        for (Object next : l) {
            System.out.println(next);
        }


    }
}
