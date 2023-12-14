package files;

import java.io.FileReader;
import java.io.IOException;

public class assignment {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("abc.txt")) {
            int i = fr.read();
            int count = 0;
            while (i != -1) {
                count++;
                i = fr.read();
            }
            
            System.out.println(count);
        }
    }

}
