package at.aau.itec.esop18.lesson09;

public class ExtendedFraction {
    int z, n;

    public ExtendedFraction() {
        z = 0;
        n = 1;
    }

    public ExtendedFraction(int n) {
        this.n = n;
    }

    /**
     * This is the default constructor setting the internal fields to the arguments passed on.
     * @param z zaehler
     * @param n nenner
     */
    public ExtendedFraction(int z, int n) {
        this.z = z;
        this.n = n;
    }

    void mult(ExtendedFraction f) {
        this.z = this.z * f.z;
        this.n = this.n * f.n;
        simplify();
    }

    void add(ExtendedFraction f) {
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
        ExtendedFraction f1 = new ExtendedFraction(35,12);
        ExtendedFraction f2 = new ExtendedFraction(24,8);
        ExtendedFraction f3 = new ExtendedFraction(42,3);

        f1.add(f2);
        System.out.println(f1.z + "/" + f1.n);
        f1.mult(f2);
        System.out.println(f1.z + "/" + f1.n);
    }

}
