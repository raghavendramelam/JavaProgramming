/*  Here's a question for you to practice using the `Predicate` functional interface:

**Question: Filtering Integers**

Write a Java program that uses the `Predicate` functional interface to filter a list of integers. The program should do the following:

1. Create a list of integers (you can use `ArrayList` or any other suitable collection).
2. Define a `Predicate` that filters out even numbers.
3. Use the `Predicate` to filter the list and print only the odd numbers.

Try to implement the solution and feel free to share your code if you'd like feedback or have any questions!
*/

package JAVA8.predicate;

import java.util.function.Predicate;
import java.util.ArrayList;

public class problem {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(26);
        al.add(45);
        al.add(56);
        al.add(8);
        al.add(10);
        al.add(7);
        al.add(3);
        Predicate<Integer> p = (i) -> i % 2 == 0;
        for (Integer i : al) {
            if (!p.test(i)) {
                System.out.println(i);
            }
        }

    }
}
