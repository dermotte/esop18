package at.aau.itec.esop18.lesson11;

public class BadStack {
    int[] data;
    int nextIndex = 0;

    public BadStack(int stackSize) {
        data = new int[stackSize];
    }

    public BadStack() {
        data = new int[42];
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
