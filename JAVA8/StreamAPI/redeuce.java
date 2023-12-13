package JAVA8.StreamAPI;

import java.util.Arrays;

public class redeuce {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int reduce = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
