package Collections;

import java.util.Vector;
import java.util.Enumeration;

public class vector {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.add(10);
        v.add(849474);
        v.add(null);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
    // VECTOR IS A SYNCHRONIZED LEGACY CLASS
}
