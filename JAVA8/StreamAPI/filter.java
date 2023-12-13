package JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {

        /* Approach -1 */
        List<Integer> list = Arrays.asList(234, 556, 7, 8, 567, 98728, 89);
        Stream<Integer> str = list.stream();
        Stream<Integer> filter = str.filter(i -> i < 20);
        filter.forEach(i -> System.out.println(i));

        /* Approach 2 */
        System.out.println("-------------------------");

        list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

        List<String> list1 = Arrays.asList("john", "Anushka", " Robert", " Ned", " rhaegar", "lyanna");
        list1.stream().filter(i -> i.startsWith("joh")).forEach(i -> System.out.println(i));

        System.out.println("-------------------------");

        user u = new user("thakur", 29);

        user u1 = new user("jadeja", 29);

        user u2 = new user("hardik", 29);

        user u3 = new user("venky", 29);

        List<user> users = Arrays.asList(u, u1, u2, u3);

        users.stream().filter(name -> name.age > 16).filter(i -> i.name.startsWith("jad"))
                .forEach(i -> System.out.println(i.name));

    }
}

class user {
    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}
