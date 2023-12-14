package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class assignment2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String s = br.readLine();
        int count = 0;
        while (s != null) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                count++;
            }
            s = br.readLine();
        }
        System.out.println(count);
        br.close();
        ;
    }
}
