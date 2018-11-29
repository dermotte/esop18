package at.aau.itec.esop18.lesson10;

public class Stack {
    int[] data;
    int nextIndex = 0;

    public Stack(int stackSize) {
        data = new int[stackSize];
    }

    public Stack() {
        data = new int[42];
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(12);
        s.push(12);
        s.push(13);
        s.push(13);
        s.push(42);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    public void push(int x) {
        if (nextIndex < data.length) {
            data[nextIndex++] = x;
        } else {
            System.out.println("-- stack overflow");
        }
    }

    public int pop() {
        int result = -1;
        if (nextIndex > 0) {
            nextIndex--;
            result = data[nextIndex];
        } else {
            System.out.println("-- stack underflow");
        }
        return result;
    }


}
