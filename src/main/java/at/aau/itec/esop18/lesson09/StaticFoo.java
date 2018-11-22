package at.aau.itec.esop18.lesson09;

public class StaticFoo {
    static long countInstances = 0;
    String dataLoad = "";

    public StaticFoo() {
        countInstances++;
        for (int i = 0; i< Math.random()*1000; i++) {
            dataLoad  += "a";
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            StaticFoo foo = new StaticFoo();
            Thread.sleep(1);
            System.out.println(countInstances);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        countInstances--;
    }
}
