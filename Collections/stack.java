package Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();
        s.add("hi");
        s.add(282);
        s.add("null");
        s.add(28263);
        s.add(7891872);
        s.capacity();
        System.out.println(s.pop());
        s.add(7891872);
        s.push(56789);
        System.out.println(s.peek());
    }
}
