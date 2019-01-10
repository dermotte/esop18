package at.aau.itec.esop18.lesson13;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class CountWordsInFile {
    public static void main(String[] args) throws IOException {
        File fileInput = new File("data/10-million-password-list-top-1000000.txt.gz");

        if (!fileInput.exists()) {
            System.err.println("File does not exist");
            System.exit(1);
        }

        FileInputStream fis = new FileInputStream(fileInput);
        GZIPInputStream gis = new GZIPInputStream(fis);
        InputStreamReader isr = new InputStreamReader(gis);
        BufferedReader br = new BufferedReader(isr);
        // reading one byte results in an int ...
        // int read = fis.read();

        // reading should be done in chunks ..
        int count = 0;
        while (br.readLine()!=null) count++;
        System.out.println("lines in file = " + count);
    }
}
