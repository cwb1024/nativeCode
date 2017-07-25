package cwb.honor.api;



/**
 * Created by PC-CWB on 2017/4/2.
 */
public class IntegerDemo {

    public static void main(String[] args) {
/*        function_1();
        function_2();
        function_3();*/
//        function_4();

//        function_5();
        function_6();
    }

    private static void function_6() {
        int i = 2 << 3;
        System.out.println(i);

        switch ("a") {
            case "a":
                System.out.println("可不可以");
                break;
        }
    }

    private static void function_5() {
        short s1 = 1;
        s1 += 1;

    }


    private static void function_4() {
        //不大于127, == true
        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
        System.out.println("======================");
        Integer cc = -128;
        Integer dd = -128;
        System.out.println(cc == dd);
        System.out.println(cc.equals(dd));
        System.out.println("======================");
        Integer c = -129;
        Integer d = -129;
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("======================");
        //大于127, ==  false
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    private static void function_3() {
        String s = Integer.toBinaryString(100);
        String s1 = Integer.toHexString(100);
        String s2 = Integer.toOctalString(100);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

    /**
     * toString(int i,int radix) 10进制转换为radix进制
     */
    private static void function_2() {
        String s = Integer.toString(10, 2);
        System.out.println(s);
    }

    /**
     * 将 radix 进制的数转换为十进制输出
     */
    private static void function_1() {
        int i = Integer.parseInt("A", 16);
        System.out.println(i);
    }

}
