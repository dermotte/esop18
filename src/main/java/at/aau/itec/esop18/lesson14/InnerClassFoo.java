package at.aau.itec.esop18.lesson14;

public class InnerClassFoo {
    private int answer = 42;

    public InnerClassFoo() {
        Bob b = new Bob();
    }

    public class Bob {
        public Bob() {
            System.out.println("new Bob instance!");
            int myAnswer = answer+2;
        }
    }

    public void run() {
        int answer = 42;
        class Charly {
            public Charly() {
                System.out.println("new Charly instance");
                int myAnswer = answer+2;
            }
        }
        Charly c = new Charly();
    }

    public static void main(String[] args) {
        InnerClassFoo foo = new InnerClassFoo();
        InnerClassFoo.Bob bob =foo.new Bob();
    }
}
