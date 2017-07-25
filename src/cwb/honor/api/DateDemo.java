package cwb.honor.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by PC-CWB on 2017/3/30.
 */
public class DateDemo {
    public static void main(String[] args) {
//        function_1();
        function_2();
    }


    //Date to  string   ,  String to Date  我怎么知道什么样的格式
    private static void function_2() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat format1 = new SimpleDateFormat("h:mm a" );
        String f = format1.format(date);
        System.out.println(f);

        try {
            Date parse = format1.parse(f);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();
    }


    private static void function_1() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//毫秒值
        String s = date.toString();
        System.out.println(s);
    }

}
