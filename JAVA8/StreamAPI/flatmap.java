package JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatmap {
    public static void main(String[] args) {
        List<String> js = Arrays.asList("java", "advjava", "springboot");
        js.stream().limit(1).forEach(i -> System.out.println(i));

        System.out.println("--------------------------");
        // System.out.println("\n");

        List<String> ui = Arrays.asList("HTML", "CSS", "JAVASCRIPT");
        List<List<String>> courses = Arrays.asList(js, ui);
        Stream<String> flatMap = courses.stream().flatMap(s -> s.stream());
        flatMap.forEach(s -> System.out.println(s));

    }
}
