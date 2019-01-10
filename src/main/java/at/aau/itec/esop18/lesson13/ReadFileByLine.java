package at.aau.itec.esop18.lesson13;

import java.io.File;

public class ReadFileByLine {
    public static void main(String[] args) {
        File fileInput = new File("data/10-million-password-list-top-1000000.txt");

        if (!fileInput.exists()) {
            System.err.println("File does not exist");
            System.exit(1);
        }
    }
}
