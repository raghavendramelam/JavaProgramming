package Collections.Sortingusingcollections;

/**
 * student
 */
public class student implements Comparable<student> {

    int id;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + "]";
    }

    String name;

    @Override
    public int compareTo(student o) {
        return this.id - o.id;
    }

}