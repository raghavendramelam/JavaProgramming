package JAVA8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Streamfile {
    public static void main(String[] args) throws Exception {
        String file = "hello.txt";
        try (Stream<String> str = Files.lines(Paths.get(file))) {
            str.filter(i -> i.startsWith("h")).forEach(i -> System.out.println(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
