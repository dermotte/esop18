package at.aau.itec.esop18.lesson14;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    String pwdFile = "data/10-million-password-list-top-1000000.txt";

    public static void main(String[] args) {
        IteratorExample i = new IteratorExample("data/10-million-password-list-top-1000000.txt");
        i.run();
    }

    public void run() {
        try {
            List<String> myList = readFromFile(pwdFile);
            /*Iterator<String> it = myList.iterator();
            while (it.hasNext()) {
                String s = it.next();
                System.out.println(s);
            }*/
            for (Iterator<String> it = myList.iterator(); it.hasNext();) {
                String line = it.next();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IteratorExample(String pwdFile) {
        this.pwdFile = pwdFile;
    }

    /**
     * Read a file from the file defined by the file name parameter
     * line by line and return it as list with one entry per line.
     * @param fileName file to read
     * @return lines of file in a list or empty list if file has not a single line.
     * @throws IOException
     */
    private List<String> readFromFile(String fileName) throws IOException {
        File fileInput = new File(fileName);

        if (!fileInput.exists()) {
            System.err.println("File does not exist");
            System.exit(1);
        }

        LinkedList<String> result = new LinkedList<>();
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
