package at.aau.itec.esop18.lesson10;

public class IntStackItem extends StackItem{
    int data;

    public IntStackItem(int data) {
        this.data = data;
    }

    public String print() {
        return new String("" + data);
    }
}
