package cwb.honor.oo;

/**
 * Created by PC-CWB on 2017/4/3.
 */
public class TestDemo {
    public static void main(String[] args) {
        Fu f = new Zi();
        Zi z = new Zi();
        System.out.println(f.name);
        System.out.println(z.name);
        f.aa();
        z.aa();

        System.out.println("===================");
        Zi zi = new Zi();
        System.out.println(zi.age);

    }
}
