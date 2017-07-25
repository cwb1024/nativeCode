package cwb.honor.string;

/**
 * Created by PC-CWB on 2017/3/28.
 */
public class StringDemo {

    public static void main(String[] args) {
       /* function_1();
        function_2();
        function_3();
        function_4();
        function_5();
        function_6();
        function_7();
        function_8();
        function_9();
        function_10();
        function_11();
        function_12();
        function_13();*/
//        function_14();
        function_15();
    }

    private static void function_15() {
        String a = "aaa";
        String b = "bbb";
        String c = a + b;
        System.out.println(c);
    }

    private static void function_14() {
        int num = 0;
        int i = 0;
        String key = "java";
        String s = "abcdjava,qjavaqq,java,quejavaqqq";
        while ((i = s.indexOf(key)) != -1) {
            num++;
            s = s.substring(i + key.length());
        }
        System.out.println(num);
    }

    private static void function_13() {
        String s = "baCdaD fa,ga ";
        String s1 = s.substring(1).toLowerCase();
        String s2 = s.substring(0, 1).toUpperCase();
        s = s2 + s1;
        System.out.println(s);

    }

    private static void function_12() {
        int up = 0;
        int low = 0;
        int str = 0;
        String s = "baCdaD fa,ga ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                up++;
            } else if (ch >= 'a' && ch <= 'z') {
                low++;
            }
        }
        str = up + low;
        System.out.println(up + "," + low + "," + str);
    }

    private static void function_11() {
        String s = "bacdaefa,ga";
        String s1 = s.toLowerCase();
        String s2 = s.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void function_10() {
        String s = "bacdaefa,ga";
        byte[] bytes = s.getBytes();
        char[] chars = s.toCharArray();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]);
        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    private static void function_9() {
        String s = "bacdaefa,ga";
        int a = s.indexOf('a');
        int fa = s.indexOf("fa");
        int a1 = s.indexOf('a', 2);
        int fa1 = s.indexOf("fa", 7);
        System.out.println(a);
        System.out.println(fa);
        System.out.println(a1);
        System.out.println(fa1);

    }

    private static void function_8() {
        String s = "abcdef,g";
        boolean ef = s.contains("ef");
        System.out.println(ef);
    }

    private static void function_7() {
        String s = "abcdef,g";
        boolean abc1 = s.startsWith("abc");
        boolean abc = s.startsWith("abc", 0);
        boolean g = s.endsWith("g");
        System.out.println(abc);
        System.out.println(abc1);
        System.out.println(g);
    }

    private static void function_6() {
        String s = "abcdef,g";
        String[] split = s.split(",");
        System.out.println(split);
    }

    private static void function_5() {
        String s = "abcdefg";
        String substring = s.substring(2);
        String substring1 = s.substring(2, 4);
        CharSequence charSequence = s.subSequence(2, 4);
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println(charSequence);

    }

    private static void function_4() {
        String s = "";
        String s1 = new String();
        String s2 = " ";
        String s3 = new String(" ");
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(s2.isEmpty());

    }

    private static void function_3() {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(ch);
        System.out.println(s);
        String s1 = new String(ch, 2, 4);
        System.out.println(s1);
    }

    private static void function_2() {
        byte[] bytes = {97, 98, 99, 100};
        String s = new String(bytes, 0, 2);
        System.out.println(s);
    }

    /**
     * byte 数组元素是正数，并且在byte范围内，去查码表，
     * 负数去查GBK表
     */
    private static void function_1() {
        byte[] bytes = {97, 98, 99, 100};
        String s = new String(bytes);
        System.out.println(s);
    }

}
