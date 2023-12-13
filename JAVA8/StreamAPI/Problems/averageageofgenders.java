
package JAVA8.StreamAPI.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String dept;
    char sex;
    int age;

    public Employee(int id, String name, String dept, char sex, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public char getGender() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}

public class averageageofgenders {
    private static List<Employee> employeeList;

    public static void main(String[] args) {
        // Initializing 25 employees with random data
        Employee employee1 = new Employee(1, "John Doe", "IT", 'M', 30);
        Employee employee2 = new Employee(2, "Jane Doe", "HR", 'F', 28);
        Employee employee3 = new Employee(3, "Bob Smith", "Finance", 'M', 35);
        Employee employee4 = new Employee(4, "Alice Johnson", "Marketing", 'F', 26);
        Employee employee5 = new Employee(5, "Charlie Brown", "IT", 'M', 32);
        Employee employee6 = new Employee(6, "Eva White", "Finance", 'F', 29);
        Employee employee7 = new Employee(7, "David Lee", "HR", 'M', 34);
        Employee employee8 = new Employee(8, "Grace Miller", "Marketing", 'F', 27);
        Employee employee9 = new Employee(9, "Frank Wilson", "IT", 'M', 31);
        Employee employee10 = new Employee(10, "Linda Harris", "Finance", 'F', 33);
        Employee employee11 = new Employee(11, "Michael Johnson", "IT", 'M', 29);
        Employee employee12 = new Employee(12, "Sophia Davis", "Marketing", 'F', 30);
        Employee employee13 = new Employee(13, "William Anderson", "HR", 'M', 32);
        Employee employee14 = new Employee(14, "Olivia Martinez", "Finance", 'F', 28);
        Employee employee15 = new Employee(15, "James Taylor", "IT", 'M', 34);
        Employee employee16 = new Employee(16, "Ava Moore", "Marketing", 'F', 31);
        Employee employee17 = new Employee(17, "Daniel Wilson", "HR", 'M', 33);
        Employee employee18 = new Employee(18, "Emily Thompson", "Finance", 'F', 27);
        Employee employee19 = new Employee(19, "Christopher Harris", "IT", 'M', 29);
        Employee employee20 = new Employee(20, "Mia Walker", "Marketing", 'F', 30);
        Employee employee21 = new Employee(21, "Matthew Davis", "HR", 'M', 31);
        Employee employee22 = new Employee(22, "Sophie Clark", "IT", 'F', 28);
        Employee employee23 = new Employee(23, "Ryan Brown", "Finance", 'M', 32);
        Employee employee24 = new Employee(24, "Ella Hall", "Marketing", 'F', 33);
        Employee employee25 = new Employee(25, "Andrew Johnson", "HR", 'M', 35);

        employeeList = Arrays.asList(
                employee1, employee2, employee3, employee4, employee5,
                employee6, employee7, employee8, employee9, employee10,
                employee11, employee12, employee13, employee14, employee15,
                employee16, employee17, employee18, employee19, employee20,
                employee21, employee22, employee23, employee24, employee25);

        Map<Character, Double> map1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(map1);

        Map<String, Double> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getAge)));

        System.out.println(collect);

        System.out.println("------------------");
        System.out.println(" youngest male in finance department");
        employeeList.stream().filter(i -> i.getDept().equals("Finance") && i.getGender() == 'M')
                .min(Comparator.comparing(Employee::getAge));

        System.out.println("----------------------------");

        System.out.println("Average salary of male and female employees");
        Map<Character, Double> emp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(emp);
    }
}
