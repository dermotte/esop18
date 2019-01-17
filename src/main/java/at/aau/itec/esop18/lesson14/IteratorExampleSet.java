package at.aau.itec.esop18.lesson14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IteratorExampleSet {
    String pwdFile = "data/10-million-password-list-top-1000000.txt";

    public static void main(String[] args) {
        IteratorExampleSet i = new IteratorExampleSet("data/10-million-password-list-top-1000000.txt");
        i.run();
    }

    public void run() {
        try {
            Set<String> myList = readFromFile(pwdFile);
            for (Iterator<String> it = myList.iterator(); it.hasNext();) {
                String line = it.next();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IteratorExampleSet(String pwdFile) {
        this.pwdFile = pwdFile;
    }

    /**
     * Read a file from the file defined by the file name parameter
     * line by line and return it as list with one entry per line.
     * @param fileName file to read
     * @return lines of file in a list or empty list if file has not a single line.
     * @throws IOException
     */
    private Set<String> readFromFile(String fileName) throws IOException {
        File fileInput = new File(fileName);

        if (!fileInput.exists()) {
            System.err.println("File does not exist");
            System.exit(1);
        }

        HashSet<String> result = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(fileInput));
        String line = br.readLine();
        if (line == null) return result;
        do {
            result.add(line);
            line = br.readLine();
        } while (line != null);
        return result;
    }
}
