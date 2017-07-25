package cwb.honor.内部类;

/**
 * Created by PC-CWB on 2017/4/5.
 */
public class TestDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.print();

        Outer outer1 = new Outer();

        Outer outer = new Outer();
        outer.out();

        //使用匿名内部类有什么好处？代码量少
        Smoking smoking = new Smoking() {
            @Override
            public void smoke() {
                System.out.println("匿名内部类实现  ->  接口的实现");
            }
            @Override
            public void eat() {
                System.out.println("在吃饭！");
            }
        };
        smoking.smoke();
        smoking.eat();
    }
}
