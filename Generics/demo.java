package Generics;

public class demo<T> {
    T obj;

    public void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }

    public static void main(String[] args) throws Exception {
        demo<Integer> d = new demo<>();

    }

}
