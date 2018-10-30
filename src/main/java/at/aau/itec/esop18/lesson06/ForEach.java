package at.aau.itec.esop18.lesson06;

public class ForEach {
    public static void main(String[] args) {
        String[] strings = {"foo", "bar", "Hello", "World"};
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
