package files;

import java.io.File;

public class example2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\PNW_checkout\\Desktop\\JAVA\\Blocks");
        String[] arr = f.list();
        for (String name : arr) {
            File f1 = new File(f, name);
            if (f1.isFile()) {
                System.out.println(name + " Yes it is a file");
            } else {
                System.out.println(name + " yes it is a directory");
            }

        }
    }
}
