package cwb.honor.内部类;

/**
 * Created by PC-CWB on 2017/4/5.
 *
 * 是类编译之后肯定有 .class文件
 * 成员内部类
 *
 * 内部类可以调用外部类的私有成员
 * 这种情况下怎么调用外部类中的成员
 *
 * 局部内部类
 *
 */
public class Outer {
    protected int i = 0;

    public class Inner {
        int i = 1;

        public void print() {
            int i = 2;
//            System.out.println(Outer.this.i);
        }
    }

    public void out(){
        class jubuInner{
            public void method(){
                System.out.println(i);
            }
        }

        jubuInner inner = new jubuInner();
        inner.method();
    }
}
