package at.aau.itec.esop18.lesson12;

public class StringStackItem implements StackItem {

    String data;

    public StringStackItem(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
