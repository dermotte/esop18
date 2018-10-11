package at.aau.itec.esop18.lesson05;

public class ArrayFun {
    public static void main(String[] args) {
        int[] foo;
        int[] bar;

        foo = new int[5];
        bar = new int[3];

        for (int i = 0; i < foo.length; i++) {
            foo[i] = i+1;
        }

        printArray(foo);
        bar = foo;
        printArray(bar);
        bar[2] = 42; // note foo is changed too
        printArray(bar);
        printArray(foo);

    }

    private static void printArray(int[] foo) {
        for (int i = 0; i< foo.length; i++) {
            System.out.print(foo[i]);
            if (i < foo.length-1) System.out.print(", ");
            else System.out.println();
        }
    }
}
