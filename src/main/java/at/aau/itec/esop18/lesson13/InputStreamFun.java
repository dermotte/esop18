package at.aau.itec.esop18.lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamFun {
    public static void main(String[] args) throws IOException {
        // File fileInput = new File("data/10-million-password-list-top-1000000.txt");
        File fileInput = new File("data/unicode.txt");

        if (!fileInput.exists()) {
            System.err.println("File does not exist");
            System.exit(1);
        }


        FileInputStream fis = new FileInputStream(fileInput);
        // reading one byte results in an int ...

        int read = 0;
        do {
            read = fis.read();
            System.out.print((char) read);
        } while (read!=-1);
        /*
        // reading should be done in chunks ..
        byte[] buffer = new byte[1024*1024];
        // byte[] buffer = new byte[(int) fileInput.length()];
        int read = 0;
        do {
            read = fis.read(buffer);
            if (read > 0) {
                String output = new String(buffer, 0, read);
                System.out.print(output);
            }
        } while (read > -1);
        */
    }
}
