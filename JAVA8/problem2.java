package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem2 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(8);
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.forEach(i -> System.out.println(i));

        // Sort the ArrayList in descending order using lambda expression
        Collections.sort(numbers, (a, b) -> (a > b) ? -1 : 1);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
