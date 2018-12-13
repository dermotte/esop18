package at.aau.itec.esop18.lesson12;

public class Stack {
    StackItem[] data;
    int nextIndex = 0;

    public Stack(int stackSize) {
        data = new StackItem[stackSize];
    }

    public Stack() {
        data = new StackItem[42];
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(new IntegerStackItem(42));
        s.push(new StringStackItem("foo"));
        s.push(new IntegerStackItem(11));

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    public void push(StackItem x) {
        if (nextIndex < data.length) {
            data[nextIndex++] = x;
        } else {
            System.out.println("-- stack overflow");
        }
    }

    public StackItem pop() {
        StackItem result = null;
        if (nextIndex > 0) {
            nextIndex--;
            result = data[nextIndex];
        } else {
            System.out.println("-- stack underflow");
        }
        return result;
    }


}
