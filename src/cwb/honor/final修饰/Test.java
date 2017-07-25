package cwb.honor.final修饰;

/**
 * Created by PC-CWB on 2017/4/4.
 */
public class Test {
    public static void main(String[] args) {
        //修饰引用类型导致的一些问题
        //跟常量一样，保存的内存地址将终生不变
        final Zi zi = new Zi();
        zi.get();
//        zi = new Zi();//不能重新让这个引用变量指向新的对象
//        zi = null;//不能重新让这个引用变量指向新的对象

        Person person = new Person(10);
        System.out.println(person.age);
//        person.age = 20;//通过构造器赋值 final 修饰之后不能改变，
    }
}
