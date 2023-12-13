package JAVA8.predicate;

public class withlambda {

    public static void main(String[] args) {
        Myinterf mif = () -> System.out.println(" m1 method called");
        mif.m1();
    }
}

@FunctionalInterface
interface Myinterf {
    public void m1();

}
