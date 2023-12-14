package files;

import java.io.*;

public class input {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String s = bf.readLine();
        System.out.println(s);
    }
}
