package files;

import java.io.File;
import java.io.IOException;

public class example1 {
    public static void main(String[] args) throws IOException {
        File f = new File("hello.txt");
        boolean b = f.createNewFile();
        System.out.println(b);
        File f1 = new File("directory");
        f1.mkdir();

        System.out.println(f1.isDirectory());

    }
}
