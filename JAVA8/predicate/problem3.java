/*
 * Create a Java program that performs the following operations using the Predicate functional interface:
a. Filter employees who are older than 30.
b. Filter employees in the "IT" department.
c. Filter employees with a salary greater than $50,000.
 */
package JAVA8.predicate;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class problem3 {

    public static void main(String[] args) {
        employee2 e = new employee2(55, "developer", 100000);
        employee2 e1 = new employee2(35, "tester", 73548);
        employee2 e2 = new employee2(55, "manager", 10000);
        employee2 e3 = new employee2(21, "HR", 10);

        List<employee2> employess = Arrays.asList(e, e1, e2, e3);
        Predicate<employee2> pe = i -> i.age > 30;
        Predicate<employee2> ped = i -> i.dept.equals("developer");
        Predicate<employee2> pes = i -> i.salary > 30000;
        Predicate<employee2> pf = pe.and(ped).and(pes);
        for (employee2 emp : employess) {
            if (pf.test(emp)) {
                System.out.println(emp.dept);
            }
        }
    }
}

class employee2 {
    public employee2(int age, String dept, double salary) {
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    int age;
    String dept;
    double salary;

}