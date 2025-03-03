package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        System.out.println(myDLL.insert(3, 2));

        myDLL.append(4);
        myDLL.append(6);
        myDLL.append(7);

        System.out.println(myDLL.remove(6));
        System.out.println(myDLL.remove(1));
        myDLL.printList();
    }
}
