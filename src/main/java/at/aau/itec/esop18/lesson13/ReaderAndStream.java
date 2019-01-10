package at.aau.itec.esop18.lesson13;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;

public class ReaderAndStream {
    public static void main(String[] args) throws IOException {
        // String with a Unicode character:
        String uString = "Victory! ✌ ä";
        // two different ways to read it:
        ByteArrayInputStream bis = new
                ByteArrayInputStream(uString.getBytes());
        CharArrayReader car = new CharArrayReader(uString.toCharArray());
        // show the difference
        int read = -1;
        do {
            read = bis.read();
            System.out.printf("%c (%03d) - %c\n", (char) read,
                    read, (char) car.read());
        } while (read > -1);

    }
}
