package cwb.honor.oo;

/**
 * Created by PC-CWB on 2017/4/3.
 * 基本型和引用型作为参数传递
 */
public class ChuandiDemo {

    public static void main(String[] args) {
        String a="张三";
        StringBuffer b = new StringBuffer("aaa");
        function_1(a);
        System.out.println(a);
        function_2(b);
        System.out.println(b);

        function_3();
    }

    private static void function_3() {


    }

    private static void function_2(StringBuffer buffer) {
        buffer = new StringBuffer("bbb");
    }

    private static void function_1(String a) {
        a = "李四";
    }
}
