package datastructures.big_o.LL;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null) {
            return false;
        }
        temp.value = value;
        return true;
    }

    public Node get(int index) {
        Node temp = head;
        int counter = 0;
        if(index >= length || index < 0) {
            return null;
        }
        while(counter <= index) {
            if (counter == index) {
                return temp;
            }
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public Node removeLast() {
        Node temp = head;
        Node pre = head;
        if (length == 0) {
            return null;
        }
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}


