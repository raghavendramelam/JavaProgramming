package JAVA8;

interface vehicle {
    public abstract void start();

    public default void clean() {
        System.out.println(" clean method started");
    }

    public static void changeoil() {
        System.out.println(" static method called");
    }
}

public class car implements vehicle {
    public void clean() {
        System.out.println(" car called clean method");
    }

    public void start() {
        System.out.println(" car started");
    }

    public static void main(String[] args) {
        car c = new car();
        vehicle.changeoil();
        c.clean();
        c.start();
    }

}
