package datastructures.binarysearchtree;

public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node right;
        Node left;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value) {
                return false;
            }
            if (temp.value < value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
            if (temp.value > value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value) {
                return true;
            }
            if (temp.value > value) {
                if (temp.left == null) {
                    return false;
                } else {
                    temp = temp.left;
                }
            }
            if (temp.value < value) {
                if (temp.right == null) {
                    return false;
                } else {
                    temp = temp.right;
                }
            }
        }
    }
}
