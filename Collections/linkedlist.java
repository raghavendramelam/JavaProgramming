package Collections;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();
        l.add(10);
        l.add(30);
        l.add(8484);
        l.add(837484);
        System.out.println(l);
        l.addLast("hello");
        System.out.println(l);
        System.out.println(l.get(1));
    }
}
