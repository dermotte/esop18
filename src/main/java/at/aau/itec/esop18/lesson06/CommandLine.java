package at.aau.itec.esop18.lesson06;

public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);
        }
    }
}
