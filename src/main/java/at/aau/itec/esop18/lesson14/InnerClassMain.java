package at.aau.itec.esop18.lesson14;

public class InnerClassMain {
    public static void main(String[] args) {
        InnerClassFoo foo = new InnerClassFoo();
        InnerClassFoo.Bob bob = foo.new Bob();
    }

}
