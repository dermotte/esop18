package at.aau.itec.esop18.lesson10;

public class SuperStack {
    StackItem[] data;
    int nextIndex = 0;

    public SuperStack(int stackSize) {
        data = new StackItem[stackSize];
    }

    public SuperStack() {
        data = new StackItem[42];
    }

    public static void main(String[] args) {
        SuperStack s = new SuperStack(12);
        s.push(new IntStackItem(42));
        s.push(new IntStackItem(44));
        s.push(new FloatStackItem(44f));
        // s.push(new StackItem()); // does not work because StackItem is abstract

        for (int i = 0; i< 3 ; i++) {
            StackItem si = s.pop();
            System.out.println(si.print());
        }
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
