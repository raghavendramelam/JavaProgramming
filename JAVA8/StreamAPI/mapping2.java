package JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class mapping2 {
    public static void main(String[] args) {

        employee e = new employee("raghava", 22, 100000.00);
        employee e1 = new employee("shiva", 28, 10080.00);
        employee e2 = new employee("ramu", 29, 5000.00);
        employee e3 = new employee("bhargav", 32, 100.00);

        List<employee> li = Arrays.asList(e, e1, e2, e3);
        li.stream().filter(i -> i.salary >= 50000).map((i) -> i.name + " " + i.age).forEach(i -> System.out.println(i));
    }
}

class employee {
    String name;
    int age;

    public employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    double salary;
}