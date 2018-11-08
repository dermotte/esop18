package at.aau.itec.esop18.lesson07;

public class VarargsFoo {
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4,42,43,65,1,0,-11999192));
    }

    static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j]> max) max = numbers[j];
        }
        return max;
    }
}
