package cwb.honor.代码块;

/**
 * Created by PC-CWB on 2017/4/5.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法");
    }

    {
        System.out.println("构造代码块1");
    }

    {
        System.out.println("构造代码块2");
    }

    static {
        System.out.println("静态代码块1");
    }

    static {
        System.out.println("静态代码块2");
    }
}
