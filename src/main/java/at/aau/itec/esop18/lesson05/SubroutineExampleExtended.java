package at.aau.itec.esop18.lesson05;

public class SubroutineExampleExtended {
    public static void main(String[] args) {
        printHeader("Introduction");
        printHeader("Method");
        printHeader("Discussion");
    }

    static void printHeader(String text) {
        printRule(42);
        System.out.println(text);
        printRule();
    }

    static void printRule() {
        System.out.println("==========================");
    }

    static void printRule(int length) {
        String rule = "";
        for (int i = 0; i < length; i++) {
            rule += "=";
        }
        System.out.println(rule);
    }
}
