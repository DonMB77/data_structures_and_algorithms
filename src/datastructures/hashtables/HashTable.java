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

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("    {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // private since this is only getting used by other methods within this class
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            // casting char to int automatically converts it to its ascii value
            int asciiValue = keyChars[i];
            // duplicating with a prime number makes it "more random"
            // modulo length makes it so that any number has a rest of between 0 and 6
            // this ofc is the precise number of possible addresses (indexes)
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        // this will always be a number between 0-6
        return hash;
    }
}
