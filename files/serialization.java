package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization implements Serializable {
    int id;
    String name;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialization e = new serialization();
        e.id = 100;
        e.name = "raghava";
        FileOutputStream fos = new FileOutputStream("file.ser");
        ObjectOutputStream bos = new ObjectOutputStream(fos);
        bos.writeObject(e);
        bos.flush();
        bos.close();

        FileInputStream fis = new FileInputStream("file.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        serialization s = (serialization) obj;
        System.out.println(s.id);
        System.out.println(s.name);
        ois.close();
    }
}
