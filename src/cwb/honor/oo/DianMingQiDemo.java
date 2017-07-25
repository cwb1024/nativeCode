package cwb.honor.oo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by PC-CWB on 2017/4/3.
 */
public class DianMingQiDemo {

    public static void main(String[] args) {
        List<Student> arr = Arrays.asList(
                new Student("张三1", 10),
                new Student("张三2", 10),
                new Student("张三3", 10),
                new Student("张三4", 10),
                new Student("张三5", 10),
                new Student("张三6", 10)
                );
        //去一个随机数
        int index = (int) (Math.random()*6);
        Random r = new Random();
        int index1 = r.nextInt(arr.size());
        System.out.println(index1);
        System.out.println(arr.get(index).toString());

    }
}
