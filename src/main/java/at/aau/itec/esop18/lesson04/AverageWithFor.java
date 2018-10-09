package at.aau.itec.esop18.lesson04;

public class AverageWithFor {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        int max = 2000;
        int numbers = 0;
        for (i = 1; i<=max; i *=2) {
            sum += i;
            numbers++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / numbers);
    }
}
