package datastructures.big_o.LL;

public class Main {

    public static void main(String[] args) {
        LinkedList myLL = new LinkedList(4);
        myLL.append(2);

        myLL.printList();

        myLL.getHead();
        myLL.getTail();
        myLL.getLength();
    }
}
