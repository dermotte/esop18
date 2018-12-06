package at.aau.itec.esop18.lesson11;

public class BadStackFoo {
    public static void main(String[] args) {
        BadStack s = new BadStack(12);
        s.push(12);
        s.push(12);
        s.push(13);
        s.push(13);
        s.push(42);
        s.nextIndex= 1;
        s.data[4] = 101;

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
