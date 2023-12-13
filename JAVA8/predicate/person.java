package JAVA8.predicate;

public class person {
    public int age;
    public String name;

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person [age=" + age + ", name=" + name + "]";
    }

}
