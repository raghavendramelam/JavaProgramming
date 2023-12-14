package files;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class assignment3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String s = br.readLine();
        int count = 0;
        while (s != null) {
            count++;
            s = br.readLine();
        }
        System.out.println(count);
        br.close();
    }
    
}
