package cwb.honor.static修饰;

/**
 * Created by PC-CWB on 2017/4/4.
 * 静态中为什么不能调用非静态的？生命周期不同
 * static 优势：当类进入方法区，就存在了
 *         缺点：随着类的消失而消失，存在相对较长
 */
public class TestDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.age = 1;
        s1.name="张三";
        s1.schoolName = "天津工业大学";
        System.out.println(s2.schoolName);

    }
}
