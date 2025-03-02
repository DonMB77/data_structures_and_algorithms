package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.removeLast();
        myDLL.prepend(4);
        myDLL.printList();
    }
}
