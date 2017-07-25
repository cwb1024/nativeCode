package cwb.honor.string;

/**
 * Created by PC-CWB on 2017/3/28.
 */

import java.util.stream.IntStream;

/**
 * 字符串缓冲区，支持可变的字符串，
 * String final 不可变，会浪费内存？-->不一样的 都要创建一个新的
 */


public class StringBufferDemo {
    public static void main(String[] args) {
//       function_1();
//       function_2();
//        function_3();
        String [] arr={"s1","s2","s3"};
        function_4(arr);

    }

    private static void function_4(String [] arr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i == arr.length - 1) {//最后一个
                stringBuffer.append(arr[i]).append("]");
            }else {
                stringBuffer.append(arr[i]).append(",");
            }
        }
        System.out.println(stringBuffer);
    }

    private static void function_3() {
        String s1 = "abcd";
        String s2 = "abcddddd";
        int i = s1.compareTo(s2);
        System.out.println(i);
    }

    private static void function_2() {
        String s = "a";
        StringBuffer s1 = new StringBuffer("abcd");
        StringBuilder s2 = new StringBuilder("abcd");
        StringBuffer b = s1.append("123");
        StringBuilder c = s2.append("123");
        c.delete(3, 4);
        System.out.println(c);

    }

    private static void function_1() {
        String s = "a";
        StringBuffer s1 = new StringBuffer("b");
        StringBuilder s2 = new StringBuilder("c");
        StringBuffer b = s1.append("bb");
        StringBuilder c = s2.append("ccC");


        System.out.println(b);
        System.out.println("b == s1:" + (b == s1));
        System.out.println(c);
        System.out.println("c==s2:" + (c == s2));
        StringBuilder delete = c.delete(1, 3);
        System.out.println(delete);

        StringBuffer d = new StringBuffer("abcd");
        d.insert(4, "222");
        int capacity = d.capacity();

        char[] ch = new char[10];
        d.getChars(0, 4, ch, 0);
        for (char ccc : ch) {
            System.out.print(ccc);
        }
        System.out.println(ch.length);
        System.out.println();
        d.deleteCharAt(3);
        d.insert(3, 'D');
        System.out.println(d);

        char cc = d.charAt(4);
        int i = d.codePointAt(4);
        int i1 = d.codePointBefore(4);
        int i2 = d.codePointCount(3, 4);
        int i3 = d.indexOf("2");
//        d.reverse();
//        d.setCharAt(4,' ');
        IntStream chars = d.chars();
        System.out.println(chars);
        System.out.println("---------------");

        System.out.println(d);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(c);
        System.out.println(d);
        System.out.println(capacity);
        int length = d.length();
        System.out.println(length);
        char[] ch1 = {'a', 'b', 'c', 'd'};
        char[] ch2 = {'1', '2', '3', '4'};


        System.arraycopy(ch1, 2, ch2, 2, 2);

        for (char chh : ch2) {
            System.out.print(chh);
        }

        String str = "abcd";
        char cccc[] = new char[10];
    }



}
