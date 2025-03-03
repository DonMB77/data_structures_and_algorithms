package datastructures.DLL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(2);
        myDLL.append(1);

        System.out.println(myDLL.isPalindrome());
    }
}
