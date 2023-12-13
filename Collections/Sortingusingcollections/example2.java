package Collections.Sortingusingcollections;

import java.util.ArrayList;
import java.util.Collections;

public class example2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(1);
        al.add(345);
        al.add(2);
        al.add(3738);
        al.add(3);
        Collections.sort(al);
        System.out.println(al);
    }

}
