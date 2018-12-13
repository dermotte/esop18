package at.aau.itec.esop18.lesson12;

public class NodeFoo {
    public static void main(String[] args) {
        Node a = new IntegerNode(42);
        Node lastNode = a;
        for (int i = 0; i < 100; i++) {
            Node x = new IntegerNode(7 + i);
            lastNode.setNextNode(x);
            lastNode = x;
        }

        // print the whole list
        Node n = a;
        while (n !=null) {
            System.out.println(n);
            n = n.getNextNode();
        }
    }
}
