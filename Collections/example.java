package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example {

    private static ListIterator<Object> listIterator;

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("hello");
        al.add(1, "hi");
        al.add(10);
        al.add("hfjnvf");
        al.contains("hi");
        // APPROACH-1
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println(al.isEmpty());
        System.out.println(al.lastIndexOf("hi"));

        // APPROACH-2
        for (Object object : al) {
            System.out.println(object);
        }

        // APPROACH-3
        Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // APPROACH-4
        ListIterator l = al.listIterator();
    }

}
