package at.aau.itec.esop18.lesson11;

public class GoodStackFoo {
    public static void main(String[] args) {
        GoodStack good = new GoodStack(15);
        try {
            good.push(2);
            good.push(-1);
            good.push(12);
            good.push(12);
            good.push(12);
            good.push(12);
            good.push(12);

        } catch (StackOverflowException e) {
            System.err.println("Stack overflow detected.");
            // e.printStackTrace();
        }
        System.out.println("Pushing is over.");

        try {
            while(good.hasNextItem())
                System.out.println(good.pop());
        } catch (StackUnderflowException e) {
            System.err.println("Stack underflow detected.");
            // e.printStackTrace();
        }
        System.out.println("Program is over.");

    }
}
