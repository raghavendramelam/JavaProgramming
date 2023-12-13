package JAVA8.ProblemsonStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problem4 {

    public static void main(String[] args) {
        employee e = new employee(2, 23456.00, "India");
        employee e1 = new employee(23, 33456.00, "India");
        employee e2 = new employee(24, 333456.00, "China");
        List<employee> emp = Arrays.asList(e, e1, e2);
        double min = emp.stream().mapToDouble(i -> i.salary).min().orElse(0.0);
        System.out.println(min);

        double max = emp.stream().mapToDouble(i -> i.salary).max().orElse(0.0);
        System.out.println(max);

        double avg = emp.stream().mapToDouble(i -> i.salary).average().orElse(0.0);
        System.out.println(avg);

        System.out.println("-----------GROUPBY-----------");
        Map<String, List<employee>> empcountries = emp.stream().collect(Collectors.groupingBy(c -> c.Country));
        System.out.println(empcountries);
    }
}

class employee {

    int id;
    double salary;
    String Country;

    @Override
    public String toString() {
        return "employee [id=" + id + ", salary=" + salary + ", Country=" + Country + "]";
    }

    public employee(int id, double salary, String country) {
        this.id = id;
        this.salary = salary;
        Country = country;
    }
}
