package cwb.honor.api;

/**
 * Created by PC-CWB on 2017/4/2.
 */
public class Person {

    //我自己随便写了一个方法，为啥也可以调用，重写了？
    public void finalize() {
        System.out.println("垃圾已经收取了！");
    }
}
