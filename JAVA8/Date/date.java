package JAVA8.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        // Converting Date to String
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM//yyyy");
        String s = sdf1.format(d);
        System.out.println(s);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd//yyyy");
        String s1 = sdf2.format(d);
        System.out.println(s1);

        // Converting String to Date
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parsDate = sdf3.parse("2022-12-20");
        System.out.println(parsDate);
    }
}
