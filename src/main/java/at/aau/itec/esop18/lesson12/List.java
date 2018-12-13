package at.aau.itec.esop18.lesson12;

public class List {
    Node head = null;
    Node tail = null;

    public List() {
        this.head = null;
    }

    public List(Node startNode) {
        this.head = startNode;
        this.tail = startNode;
    }

    public void append(Node n) {
        if (head == null)
            head = n;
        else
            tail.nextNode = n;
        tail = n;
    }

    public void prepend(Node p) {
        p.nextNode = head;
        head = p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);

        if (head == null) return sb.toString();

        Node currentNode = head;
        while (currentNode != null) {
            sb.append(((IntegerNode) currentNode).getValue() + ", ");
            currentNode = currentNode.nextNode;
        }
        return sb.toString();
    }

    public int index(int val) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode instanceof IntegerNode) {
                IntegerNode in = (IntegerNode) currentNode;
                if (in.getValue() == val) {
                    return index;
                }
            }
            index++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }

    public static void main(String[] args) {
        List myList = new List();
        myList.append(new IntegerNode(42));
        myList.append(new IntegerNode(13));
        myList.append(new IntegerNode(24));
        myList.prepend(new IntegerNode(12));

        System.out.println(myList);



        System.out.println(myList.index(12));
        System.out.println(myList.index(42));
        System.out.println(myList.index(24));
        System.out.println(myList.index(102834));
    }

}
