package files;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter fe = new FileWriter("abc.txt");
        fe.write('r');
        fe.write("\t\t\t\t\t\t\t");
        fe.flush();
        fe.write("hello i am raghava");
        fe.write("\n");
        char[] ch = { 'a', 's' };
        fe.write(ch);
        fe.flush();

        fe.close();
    }
}
