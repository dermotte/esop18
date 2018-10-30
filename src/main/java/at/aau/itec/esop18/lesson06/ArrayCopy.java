package at.aau.itec.esop18.lesson06;

public class ArrayCopy {
    public static void main(String[] args) {
        // this is not copying
        int[] a = {3, 2, 1, 42};
        int[] b = a;

        // copy with clone
        b = a.clone();

        // copy manually
        b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // fast option
        System.arraycopy(a, 0, b, 0, a.length);
    }
}
