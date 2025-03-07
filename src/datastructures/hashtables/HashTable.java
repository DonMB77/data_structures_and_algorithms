package datastructures.hashtables;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public class Node {
        String key;
        Integer value;
        Node next;

        public Node (String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
