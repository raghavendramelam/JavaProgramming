package Collections.Sortingusingcollections;

import java.util.Comparator;
import java.util.TreeSet;

public class example {
    public static void main(String[] args) {
        TreeSet<Object> t = new TreeSet<Object>(new MyComparator());
        t.add("dfjvbj");
        t.add("hdkshbc");
        t.add("qwedfvijh");
        t.add("ads");
        System.out.println(t);
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        String s1 = (String) arg0;
        String s2 = (String) arg1;
        return s1.compareTo(s2);
    }
}
