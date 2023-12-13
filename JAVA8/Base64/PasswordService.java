package JAVA8.Base64;

import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Base64;

public class PasswordService {
    // private static Decoder decoder;

    public static void main(String[] args) {
        String pwd = "raghava2001";
        Encoder encoder = Base64.getEncoder();
        byte[] enc = encoder.encode(pwd.getBytes());
        String encodecode = new String(enc);
        System.out.println(encodecode);

        Decoder decoder = Base64.getDecoder();

        byte[] decode = decoder.decode(encodecode);

    }
}
