package cwb.honor.权限2;

import cwb.honor.权限.A;

/**
 * Created by PC-CWB on 2017/4/9.
 *
 *      受保护权限，子类对象都不能调用，受保护权限调用的方式，只有一种，在子类的里面用，别出去！！！！
 */
public class B extends A{
    public void show(){
//        new A().print;//不在同一个包下，用子类对象却不能调用，我勒个擦。
        print();//直接调用
    }
}
