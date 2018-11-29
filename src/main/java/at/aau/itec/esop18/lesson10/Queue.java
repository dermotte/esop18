package at.aau.itec.esop18.lesson10;

public class Queue {
    private int[] data;
    private int endIndex = 0;
    private int startIndex = 0;
    private int length = 0;

    public Queue(int queueSize) {
        this.data = new int[queueSize];
    }

    public void put(int x) {
        if (length == data.length) return;
        data[endIndex] = x;
        length++;
        endIndex = (endIndex + 1) % data.length;
    }

    public int get() {
        if (length == 0) return -1;
        length--;
        int result = -1;
        result = data[startIndex];
        startIndex = (startIndex + 1) % data.length;
        return result;
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.put(42);
        q.put(43);
        q.put(44);
        q.put(45);

        // q.data = null;

        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());

    }
}
