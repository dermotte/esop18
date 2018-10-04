package at.aau.itec.esop18.lesson02;

public class ExpressionsTwo {
    public static void main(String[] args) {
        int i, j;
        short s;
        byte b;
        // i = j;        // ok: derselbe Typ
        i = (int) 300;    // ok (Zahlkonstanten sind int)
        b = (byte) 300;    // nicht ok: 300 passt nicht in byte
        // i = s;        // ok
        // s = i;        // nicht ok

    }
}
