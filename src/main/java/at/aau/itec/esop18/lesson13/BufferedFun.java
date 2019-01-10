package at.aau.itec.esop18.lesson13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFun {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data/out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 10000000; i++)
            bw.write(i + "\n");
        bw.close();
    }
}
