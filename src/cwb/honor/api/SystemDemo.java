package cwb.honor.api;

/**
 * Created by PC-CWB on 2017/4/2.
 */
public class SystemDemo {
    public static void main(String[] args) {
//        function_1();
//        function_2();
//        function_3();
        function_4();

    }

    private static void function_4() {
        int a[] = {11,22,33,33};
        int b[] = {55, 66, 77};
        System.arraycopy(a, 1, b, 1, 2);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+",");
        }
    }

    private static void function_3() {

    }

    /**
     * JVM在内存中，收取对象的垃圾
     * static void gc();
     */
    private static void function_2() {
        System.out.println("执行了function_2();");
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.gc();
    }

    private static void function_1() {
        while (true) {
            System.out.println("---");
            System.exit(0);    //输入0,正常结束JVM,非0表示异常终止JVM
        }
    }

}
