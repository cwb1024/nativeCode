package cwb.honor.api;

import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by PC-CWB on 2017/4/2.
 */
public class CalendarDemo {

    public static void main(String[] args) throws ParseException {
        function_5();
        function_6();
    }

    /**
     * 闰年计算：
     */
    private static void function_7() {
        Calendar c = Calendar.getInstance();
        c.set(3000, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int i = c.get(Calendar.DAY_OF_MONTH);
        if (i == 29) {
            System.out.println(c.get(Calendar.YEAR) + "闰年");
        } else {
            System.out.println(c.get(Calendar.YEAR) + "不是闰年");
        }
    }

    private static void function_6() throws ParseException {
        System.out.println("Date:请输入出生日期：格式：yyyy-MM-dd");
        String birthday = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birDate = sdf.parse(birthday);
        Date todayDate = new Date();
        long birthdaySecond = birDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond - birthdaySecond;
        if (second < 0) {
            System.out.println("未出生呢！");
            return;
        }
        long day=second / 1000 / 60 / 60 / 24;
        System.out.println(day);
    }

    //求自己出生了几天，Calendar少一个月
    private static void function_5() {
        Calendar bir = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        Scanner sc= new Scanner(System.in);
        System.out.println("Calendar:请输入年份");
        Integer year = Integer.valueOf(sc.next());
        System.out.println("Calendar:请输入月份，输入的月份比实际多一个月");
        Integer month = Integer.valueOf(sc.next());
        System.out.println("Calendar:请输入天");
        Integer day = Integer.valueOf(sc.next());
        bir.set(Calendar.YEAR, year);
        bir.set(Calendar.MONTH, month);
        bir.set(Calendar.DATE, day);
        long diffDays = (c.getTimeInMillis() - bir.getTimeInMillis()) / (1000 * 60 * 60 * 24);
        System.out.println("日历计算一下活了多少天：" + diffDays);
        System.out.println("Calendar.DAY_OF_YEAR:"+bir.get(Calendar.DAY_OF_YEAR));
        System.out.println("Calendar.DAY_OF_MONTH:"+bir.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar.DATE:"+bir.get(Calendar.DATE));
    }

    /**
     * 日历对象转日期对象
     */
    private static void function_4() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    private static void function_3() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -10);
        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH) + 1;

        int dar = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年-" + month + "月-" + dar + "日");

    }

    /**
     * Calendar类的set方法
     * 设置日历
     * set(int field,int value)
     * field 设置的哪个日历字段
     * value 设置后的具体的数值
     */
    private static void function_2() {
        Calendar c = Calendar.getInstance();
//        c.set(Calendar.MONTH, 6);

        c.set(2018, 5, 6);
        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH) + 1;

        int dar = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年-" + month + "月-" + dar + "日");

    }

    /**
     * Calendar类的get方法
     */
    private static void function_1() {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH) + 1;

        int dar = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年-" + month + "月-" + dar + "日");
    }


  @Test
        public void testDemo() {
            Calendar a = Calendar.getInstance(),
                    b = Calendar.getInstance();
            a.set(2015, Calendar.MARCH, 31);
            b.set(2015, Calendar.APRIL, 1);
            long diffDays = (b.getTimeInMillis() - a.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            System.out.println(diffDays);
        }

}
