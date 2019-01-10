package at.aau.itec.esop18.lesson13;

import java.io.*;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ObjOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LinkedList s = new LinkedList();
        s.add("Alice");
        s.add("Bob");
        s.add("Charly");

        ObjectOutputStream oos = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("data/out.obj")));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new GZIPInputStream(new FileInputStream("data/out.obj")));
        Object o = ois.readObject();
        ((LinkedList) o).forEach(o1 -> System.out.println(o1));
    }
}
