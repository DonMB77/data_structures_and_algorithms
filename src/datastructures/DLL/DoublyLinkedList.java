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

    public boolean isPalindrome() {
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            return true;
        }
        boolean isPalindrome = false;
        Node iteratorBehind = tail;
        Node iteratorFront = head;
        for (int i = 0; length / 2 > i; i++) {
            if (iteratorFront.value == iteratorBehind.value) {
                isPalindrome = true;
                iteratorFront = iteratorFront.next;
                iteratorBehind = iteratorBehind.prev;
            } else {
                return false;
            }
        }
        return true;
    }

    public void reverse () {
        if (length <= 1) {
            return;
        }
        int tempValue = 0;
        Node iteratorFront = head;
        Node iteratorBehind = tail;
        for (int i = 0; length / 2 > i; i++) {
            tempValue = iteratorFront.value;
            iteratorFront.value = iteratorBehind.value;
            iteratorBehind.value = tempValue;
            iteratorBehind = iteratorBehind.prev;
            iteratorFront = iteratorFront.next;
        }
    }

    public void swapFirstLast() {
        if (length < 2) {
            return;
        }
        int tempHead = head.value;
        head.value = tail.value;
        tail.value = tempHead;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        } else {
            return false;
        }
    }

    public Node remove(int index) {
        if (index >= length || index < 0) {
            return null;
        }
        if (index == length-1) {
            removeLast();
        }
        if (index == 0) {
            removeFirst();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (length / 2 < index) {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        } else {
            for (int iterator = 0; iterator < index; iterator++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
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
