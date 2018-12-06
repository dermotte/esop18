package at.aau.itec.esop18.lesson11;

public class Fib {

    public static long get(long number) {
        if (number <= 2) return 1;
        return get(number-1) + get(number-2);
    }

    public static void main(String[] args) {
        System.out.println(get(42*10));
    }
}
