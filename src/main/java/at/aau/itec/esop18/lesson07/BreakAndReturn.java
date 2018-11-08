package at.aau.itec.esop18.lesson07;

public class BreakAndReturn {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5)
                break;
            // return does things differently
        }
        System.out.println("ende erreicht");
    }
}
