package at.aau.itec.esop18.lesson08;

public class Fraction {
    int z, n;

    void mult(Fraction f) {
        this.z = this.z * f.z;
        this.n = this.n * f.n;
        simplify();
    }

    void add(Fraction f) {
        this.z = this.z * f.n + f.z* this.n;
        this.n = this.n * f.n;
        simplify();
    }

    private void simplify() {
        int g = ggt(n,z);
        n = n/g;
        z = z/g;
    }

    int ggt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();
        f1.z = 35;
        f1.n = 12;
        f2.z = 24;
        f2.n = 8;


        f1.add(f2);
        System.out.println(f1.z + "/" + f1.n);
        f1.mult(f2);
        System.out.println(f1.z + "/" + f1.n);
    }

}
