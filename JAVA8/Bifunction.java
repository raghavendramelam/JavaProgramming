package JAVA8;

import java.util.function.BiFunction;

public class Bifunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bif = (a, b) -> a + b;
        Integer sum = bif.apply(2, 3);
        System.out.println(sum);
    }

}
