package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        System.out.println(myDLL.insert(3, 2));

        myDLL.append(4);
        myDLL.append(6);
        myDLL.append(7);

        myDLL.insert(1, 2);
        myDLL.printList();
    }
}
