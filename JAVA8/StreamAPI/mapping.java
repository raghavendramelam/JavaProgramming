package JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class mapping {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("usa", "india", "japan", "uk");

        countries.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

        System.out.println("-----------------------------------");

        countries.stream().mapToInt(i -> i.length()).forEach(i -> System.out.println(i));

        System.out.println("----------------------------");

        countries.stream().filter(i -> i.startsWith("j")).map(i -> i + "-" + i.length())
                .forEach(i -> System.out.println(i));

    }
}
