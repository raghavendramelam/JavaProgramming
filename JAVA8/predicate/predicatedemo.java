package JAVA8.predicate;

import java.util.function.Predicate;

public class predicatedemo {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;
        p.test(37484739);
        System.out.println(p.test(902));
        System.out.println(p.test(0));
    }
}
