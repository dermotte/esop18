package at.aau.itec.esop18.lesson11;

public class GoodStack {
    int[] data;
    int nextIndex = 0;

    public GoodStack(int stackSize) {
        data = new int[stackSize];
    }

    public GoodStack() {
        data = new int[42];
    }

    public void push(int x) throws StackOverflowException {
        if (nextIndex < data.length) {
            data[nextIndex++] = x;
        } else {
            throw new StackOverflowException();
        }
    }

    public int pop() throws StackUnderflowException {
        int result = -1;
        if (nextIndex > 0) {
            nextIndex--;
            result = data[nextIndex];
        } else {
            throw new StackUnderflowException();
        }
        return result;
    }


    public boolean hasNextItem() {
        boolean b;
        if (nextIndex <= 0 )
            b = false;
        else
            b = true;
        return b;
    }

    public static void main(String[] args) {
        GoodStackFoo.main(new String[]{});
    }
}
