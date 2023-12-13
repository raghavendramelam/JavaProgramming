/*Task: Given a list of integers, filter out the even numbers and square the remaining ones. */
package JAVA8.ProblemsonStreams;

import java.util.Arrays;
import java.util.List;

public class problem1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().filter(i -> i % 2 != 0).map(i -> i * i).forEach(i -> System.out.println(i));

    }
}
