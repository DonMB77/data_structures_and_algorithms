package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.append(3);
        myDLL.append(5);
        myDLL.append(6);

        myDLL.set(0, 1);
        myDLL.printList();
    }
}
