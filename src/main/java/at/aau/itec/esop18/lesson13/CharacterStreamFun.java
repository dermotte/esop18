package at.aau.itec.esop18.lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamFun {
    public static void main(String[] args) throws IOException {
        // File fileInput = new File("data/10-million-password-list-top-1000000.txt");
        File fileInput = new File("data/unicode.txt");

        if (!fileInput.exists()) {
            System.err.print("File does not exist");
            System.exit(1);
        }


        FileReader fir = new FileReader(fileInput);
        // reading one byte results in an int ...

        int read = 0;

        // alternative to the do/while loop approach
        while ((read = fir.read()) > -1) {
            System.out.print((char) read);
        }

    }
}
