package at.aau.itec.esop18.lesson12;

public class IntegerStackItem implements StackItem {
    private int data = 0;

    public IntegerStackItem(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
