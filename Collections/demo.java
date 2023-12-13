package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student(11, "raghu"));
        al.add(new student(12, "vamsi"));
        al.add(new student(13, "hari"));
        al.add(new student(14, "krishna"));

        for (student s : al) {
            System.out.println(s.toString());
        }

        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println(al.get(i));
        }

    }
}
