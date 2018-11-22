package at.aau.itec.esop18.lesson09;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Mary had a little lamb";
        String output = "";

        for (int i = input.toCharArray().length -1; i >= 0 ; i--) {
            char c = input.toCharArray()[i];
            output +=c;
        }
        System.out.println("output = " + output);
    }
}
