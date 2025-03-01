package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        System.out.println(myDLL.removeLast().value);

        myDLL.printList();
    }
}
