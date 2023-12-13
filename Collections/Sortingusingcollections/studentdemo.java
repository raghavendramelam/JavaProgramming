package Collections.Sortingusingcollections;

import java.util.ArrayList;
import java.util.Collections;

public class studentdemo {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student(139, "raghu"));
        al.add(new student(23, "azad"));
        al.add(new student(12, "xavier"));
        Collections.sort(al);
        System.out.println(al);
    }
}
