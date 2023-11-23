package effective.study.chapter03.item10;

import java.sql.Timestamp;
import java.util.Date;

public class EqualsInJava extends Object{

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        //대칭성 위배!
        System.out.println(date.equals(timestamp));
        System.out.println(timestamp.equals(date));
    }
}
