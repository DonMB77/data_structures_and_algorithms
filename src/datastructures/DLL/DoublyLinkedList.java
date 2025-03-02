package datastructures.DLL;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            tail = null;
            head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail " + tail.value);
    }

    public void getLength() {
        System.out.println("Length " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
