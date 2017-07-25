package cwb.honor.api;

import java.math.BigInteger;

/**
 * Created by PC-CWB on 2017/4/2.
 */
public class BigIntegerDemo {

    public static void main(String[] args) {
        function_1();
    }

    private static void function_1() {
        BigInteger a = new BigInteger("1231324894791239281798427198479814712979");
        BigInteger b = new BigInteger("123132489479123928179842719847981471297932132132132132131231232132");
        System.out.println(a);
        System.out.println(b);

        //对于两个超级大数进行四则运算
        //  +
        BigInteger add = a.add(b);
        System.out.println(add);
        //  -
        BigInteger subtract = a.subtract(b);
        System.out.println(subtract);
        //  *
        BigInteger multiply = a.multiply(b);
        System.out.println(multiply);

        //  /
        BigInteger divide = b.divide(a);
        System.out.println(divide);
    }
}
