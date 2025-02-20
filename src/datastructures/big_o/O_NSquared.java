package datastructures.big_o;

public class O_NSquared {

    public static void printItems(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
