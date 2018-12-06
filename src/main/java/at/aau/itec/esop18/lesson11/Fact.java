package at.aau.itec.esop18.lesson11;

import java.math.BigInteger;

public class Fact {
    public static void main(String[] args) {
        for (int i = 1; i <= 3000; i++) {
            BigInteger bint = new BigInteger(""+i);
            System.out.println(fact(bint));
        }
    }

    static BigInteger fact(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return fact(n.subtract(BigInteger.ONE)).multiply(n);
        }
    }
}
