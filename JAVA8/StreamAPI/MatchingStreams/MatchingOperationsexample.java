package JAVA8.StreamAPI.MatchingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingOperationsexample {
    /**
     * Terminal Operations in this example
     * 
     */
    public static void main(String[] args) {
        person p = new person("raghava", "India");
        person p1 = new person("jessica", "USA");
        List<person> persons = Arrays.asList(p, p1);

        System.out.println(persons.stream().anyMatch(p11 -> p11.country.equals("Russia")));
        System.out.println(persons.stream().noneMatch(n -> n.country.equals("Finland")));
        System.out.println(persons.stream().allMatch(all -> all.country.equals("USA")));
        System.out.println("--------------Collectors in java8---------");

        List<person> Indians = persons.stream().filter(i -> i.name.equals("India")).collect(Collectors.toList());
        System.out.println(Indians);
        Indians.forEach(i -> System.out.println(i));

    }
}

class person {
    String name;
    String country;

    public person(String name, String country) {
        this.name = name;
        this.country = country;
    }

}
