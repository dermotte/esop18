package at.aau.itec.esop18.lesson05;

public class SubroutineExample {
    public static void main(String[] args) {
        printHeader("Introduction");
        printHeader("Method");
        printHeader("Discussion");
    }

    static void printHeader(String text) {
        printRule();
        System.out.println(text);
        printRule();
    }

    static void printRule() {
        System.out.println("<~==========================~>");
    }
}
