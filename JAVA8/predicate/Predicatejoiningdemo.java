package JAVA8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class employee {
    String name;
    String location;
    String dept;

    public employee(String name, String location, String dept) {
        this.name = name;
        this.location = location;
        this.dept = dept;
    }
}

public class Predicatejoiningdemo {

    public static void main(String[] args) {
        employee e1 = new employee("raju", "chennai", "ddevops");
        employee e2 = new employee("rani", "hyd", "database");
        employee e3 = new employee("shiva", "kolkata", "database");
        employee e4 = new employee("ashok", "mumbai", "backend");
        List<employee> employees = Arrays.asList(e1, e2, e3, e4);
        Predicate<employee> p1 = e -> e.location.equals("hyd");
        Predicate<employee> p2 = e -> e.dept.equals("database");
        Predicate<employee> p3 = e -> e.name.charAt(0) == 'r';
        Predicate<employee> p = p1.and(p2).and(p3);
        for (employee e : employees) {
            if (p.test(e)) {
                System.out.println(e.name);
            }
        }
    }
}
