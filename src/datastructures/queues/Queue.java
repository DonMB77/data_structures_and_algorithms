package datastructures.queues;

public class Queue {
    Node first;
    Node last;
    int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node {
        Node next;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
