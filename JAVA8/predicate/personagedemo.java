package JAVA8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class personagedemo {

    public static void main(String[] args) {
        person p = new person(10, "raghu");
        person p1 = new person(110, "karthi");
        person p2 = new person(100, "vishwa");
        person p3 = new person(0, "usha");
        List<person> persons = Arrays.asList(p, p1, p2, p3);
        Predicate<person> predicate = (a) -> a.age >= 18;
        for (person p7 : persons) {
            if (predicate.test(p7)) {
                System.out.println(p7.name);
            }
        }
    }
}