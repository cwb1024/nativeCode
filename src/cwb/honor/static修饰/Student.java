package cwb.honor.static修饰;

/**
 * Created by PC-CWB on 2017/4/4.
 * 静态修饰有什么意义？
 * 静态修饰就是共享数据，节约内存
 * 对象特有数据：非静态修饰
 * 对象共享数据:静态修饰
 */
public class Student {
    String name;
    int age;
    static String schoolName;

}
