package datastructures.big_o.pointers;

import java.util.HashMap;

public class PointersExample {

    public static void main(String[] args) {

        //example that doesn't use a pointer:
        int num1 = 11;
        int num2 = num1; // this only equals at initialization

        num1 = 22;

        System.out.println("num1: " + num1); // this prints 22
        System.out.println("num2: " + num2); // this still prints 11

        // example that uses a pointer:
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value1" , 11);
        map2 = map1;

        map1.put("value1", 22);

        System.out.println(map1); // shows the same key and value
        System.out.println(map2); // shows the same key and value
    }
}
