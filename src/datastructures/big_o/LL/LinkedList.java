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

    public boolean hasLoop() {
        Node slowPointer = head;
        Node quickPointer = head;
        Node iterationPointer = head;
        if (slowPointer == null) {
            return false;
        }
        if(slowPointer.next == null) {
            return false;
        }
        while(true) {
            if(quickPointer.next == null) {
                return false;
            }
            iterationPointer = iterationPointer.next;
            if(iterationPointer.next == null){
                return false;
            }
            quickPointer = iterationPointer.next;
            iterationPointer = iterationPointer.next;
            slowPointer = slowPointer.next;
            if(slowPointer == quickPointer){
                return true;
            }
        }
    }

    public Node findMiddleNode() {
        Node slowPointer = head;
        Node quickPointer = head;
        Node iterationPointer = head;
        if (slowPointer == null) {
            return null;
        }
        if(slowPointer.next == null) {
            return slowPointer;
        }
        while(true) {
            if(quickPointer.next == null) {
                return slowPointer;
            }
            iterationPointer = iterationPointer.next;
            if(iterationPointer.next == null){
                return slowPointer.next;
            }
            quickPointer = iterationPointer.next;
            iterationPointer = iterationPointer.next;
            slowPointer = slowPointer.next;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for(int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node remove(int index) {
        if(index >= length || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length-1) {
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public boolean insert(int index, int value) {
        if(index > length || index < 0) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node beforeNode = get(index-1);
        newNode.next = beforeNode.next;
        beforeNode.next = newNode;
        length++;
        return true;
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


