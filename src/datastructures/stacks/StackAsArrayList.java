package datastructures.stacks;

import java.util.ArrayList;

public class StackAsArrayList<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.getLast();
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T t) {
        stackList.add(t);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            return null;
        } else {
            return stackList.remove(stackList.size() - 1);
        }
    }

}
