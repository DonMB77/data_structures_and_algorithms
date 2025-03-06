package datastructures.binarysearchtree;

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        Node right;
        Node left;

        private Node(int value) {
            this.value = value;
        }
    }
}
