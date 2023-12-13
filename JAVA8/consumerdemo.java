package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerdemo {
    public static void main(String[] args) {
        Consumer<String> c = (name) -> System.out.println(name + " good morning");

        c.accept("ashok");
        c.accept("swathi");
        List<Integer> aslist = Arrays.asList(12, 12, 34, 5, 6, 7, 8, 9);
        aslist.forEach(i -> System.out.print(i));
    }
}
