package at.aau.itec.esop18.lesson10;

public class FloatStackItem extends StackItem {
    float data;

    public FloatStackItem(float data) {
        this.data = data;
    }

    public String print() {
        return new String("" + data);
    }
}
