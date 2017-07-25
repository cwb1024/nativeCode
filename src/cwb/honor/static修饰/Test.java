package cwb.honor.static修饰;

/**
 * Created by PC-CWB on 2017/4/5.
 * 多态调用：编译看谁    运行看谁
 * 编译都看 = 左边的父类，父类有编译成功，父类没有编译失败
 * 运行，静态方法，运行父类中的静态方法
 * 运行，非静态方法，运行子类中重写父类的方法
 * 成员变量，编译运行全是父类
 */
public class Test {
    public static void main(String[] args) {

        Fu f = new Zi();
        System.out.println(f.i);

        f.print();//静态都属于类，而不是对象，父类的引用.静态方法
    }
}
