package JAVA8.predicate;

public class withoutlambda implements interf {

    public static void main(String[] args) {
        withoutlambda l = new withoutlambda();
        l.m3();
        l.m1();
    }

    @Override
    public void m1() {
        System.out.println(" hello from m1 method");
    }

}

@FunctionalInterface
interface interf {
    public abstract void m1();

    public default void m3() {
        System.out.println(" hello");
    }

}