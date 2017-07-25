package cwb.honor.继承;

/**
 * Created by PC-CWB on 2017/4/4.
 */
public class Net extends Maintainer {
    public Net(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName()+"-"+getAge()+":进行网络开发");
    }
}
