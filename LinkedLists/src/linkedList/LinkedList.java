package linkedList;

public class LinkedList {

    // Node class is now embedded inside LinkedList
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public void append(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    // Insert a node at a specific index
    public void insertAt(int data, int position) {
        if (position < 0 || position > this.size) {
            return;
        }
        if (position == 0) {
            this.add(data);
            return;
        }
        Node current = this.head;
        int counter = 0;

        while (counter < position - 1) {
            current = current.next;
            counter++;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        this.size++;
    }

    // Getters to access private variables safely in tests
    public Node getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }
}
