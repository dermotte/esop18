package at.aau.itec.esop18.lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        for (int i = 0; i< 1000000; i++) {
            l.add(Math.random()*256 + "");
        }
        System.out.println("finished");

        long l1 = System.currentTimeMillis();
        String d = null;
        for (int i = 0; i< 1000; i++) {
            d = l.get((int) Math.floor(Math.random()* l.size()));
        }
        System.out.println(System.currentTimeMillis()-l1);


    }
}
