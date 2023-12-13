package JAVA8.predicate;

import java.util.function.Predicate;

public class example {

    public static void main(String[] args) {
        String[] arr = { "Anushka", "Sunny", "Kajal", "malavika" };
        Predicate<String> p = (name) -> name.charAt(0) == 'A';
        for (String name : arr) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
