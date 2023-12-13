package JAVA8.ProblemsonStreams;

import java.util.Arrays;
import java.util.List;

public class problem3 {
    public static void main(String[] args) {

        /*
         * Task: Given a list of numbers, filter out the even numbers and count the
         * remaining ones.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long a = numbers.stream().filter(i -> i % 2 != 0).count();
        System.out.println(a);

        /*
         * Task: Given a list of strings, concatenate them into a single string,
         * separating each with a comma.
         */

        List<String> words = Arrays.asList("Java", "Stream", "Map", "Filter", "Reduce");
        String concat = words.stream().reduce((s1, s2) -> s1 + "," + s2).orElse("");
        System.out.println(concat);
    }
}
