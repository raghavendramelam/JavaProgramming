package files;

import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();
        System.out.println(i);
        fr.close();
    }
}
