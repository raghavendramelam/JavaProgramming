package JAVA8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("raghukrishna");
        al.add("shivakumar");
        al.add("priya");
        al.add("foxhead");
        al.add("asshole");
        al.add("vamsisjsn");
        al.add("jsbcjdcnkd");
        Predicate<String> p = (i) -> i.length() >= 3;
        for (String i : al) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }

    }
}
