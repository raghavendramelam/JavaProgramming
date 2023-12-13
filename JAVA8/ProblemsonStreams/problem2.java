package JAVA8.ProblemsonStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class problem2 {
    public static void main(String[] args) {
        List<String> prolang = Arrays.asList("java", "python", "javascript", "c", "ruby");
        List<String> servlang = Arrays.asList("html", "css", "bootstrap", "react", "angular");

        // Combine the lists into a list of lists
        List<List<String>> courses = Arrays.asList(prolang, servlang);

        // Use flatMap to convert the list of lists into a single stream of strings
        Stream<String> str = courses.stream().flatMap(s -> s.stream());

        // Convert each string to uppercase, filter out those starting with "J", and
        // print the result
        str.map(s -> s.toUpperCase()).filter(i -> i.startsWith("J")).forEach(i -> System.out.println(i));
    }
}
