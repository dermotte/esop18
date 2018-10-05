package at.aau.itec.esop18.lesson03;

public class DanglingElse {
    public static void main(String[] args) {
        int x = 42;
        int y = 13;
        if (x>0)
            if (x > y)
                if (y > 0)
                    x = 12;
                else
                    x = 13;
    }
}
