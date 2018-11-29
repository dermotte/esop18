package at.aau.itec.esop18.lesson10;

public class MathFoo {
    public static void main(String[] args) {
        System.out.println(Math.cos(Math.PI/2));
        System.out.println(Math.sin(Math.PI/2));

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(chars[(int) Math.floor(Math.random()*chars.length)]);

        /*
        for (double d = 0d; d < 10; d+=0.1) {

            double x = 60*(Math.sin(d) + 1);
            x = Math.round(x);
            for (int i = 0; i< x; i++)
                System.out.print(' ');
            System.out.println('*');
        }
        */

        System.out.println(Math.atan2(1, 1)*4);

    }
}
