package at.aau.itec.esop18.lesson09;

public class StringFoo {
    public static void main(String[] args) {
        String myString = "Hello World!";
        for (int i = 0; i < myString.length(); i++) {
            char[] foo = "             ".toCharArray();
            myString.getChars(0, i, foo, 0);
            System.out.println(new String(foo));
        }
    }
}
