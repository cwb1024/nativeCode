package cwb.honor.api;

import java.math.BigDecimal;

/**
 * Created by PC-CWB on 2017/4/2.
 * 超级大型的浮点数据，提供高精度的浮点运算 BigDecimal  计算账务问题时要用到
 */
public class BigDecimalDemo {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("0.0001");
        BigDecimal b = new BigDecimal("0.0009");
        BigDecimal add = a.add(b);
        System.out.println(add);//0.0010

        BigDecimal subtract = a.subtract(b);
        System.out.println(subtract);

        BigDecimal multiply = a.multiply(b);
        System.out.println(multiply);

        BigDecimal divide = b.divide(a);
        System.out.println(divide);

        BigDecimal aa = new BigDecimal("1.301");
        BigDecimal bb = new BigDecimal("101");
        BigDecimal divide1 = aa.divide(bb,2);
        System.out.println(divide1);
    }

}
