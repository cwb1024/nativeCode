package cwb.honor.继承;

/**
 * Created by PC-CWB on 2017/4/4.
 */
public class JavaEE extends Develop {
    public JavaEE(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName()+"-"+getAge()+":进行javaEE开发");
    }
}
