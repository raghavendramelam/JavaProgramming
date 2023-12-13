package Collections.Sortingusingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class empdemo {
    public static void main(String[] args) {
        ArrayList<employee> al = new ArrayList<>();
        al.add(new employee(1029, "raghu"));
        al.add(new employee(4738, "kiran"));
        al.add(new employee(345, "bhanu"));
        al.add(new employee(109, "vamsi"));
        Collections.sort(al, new Comparator<employee>() {

            @Override
            public int compare(employee e1, employee e2) {
                if (e1.id > e2.id) {
                    return 1;
                } else if (e1.id < e2.id) {
                    return -1;
                }
                return 0;
            }

        });

        for (employee iterable_element : al) {
            System.out.println(iterable_element);
        }
    }

}