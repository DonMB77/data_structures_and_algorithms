package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.prepend(5);
        myDLL.prepend(8);
        myDLL.removeFirst();
        myDLL.printList();
    }
}
