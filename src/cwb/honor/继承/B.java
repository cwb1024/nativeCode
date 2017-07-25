package cwb.honor.继承;

import cwb.honor.权限.A;

/**
 * Created by PC-CWB on 2017/4/5.
 */
public class B extends A {

    public void show(){
        //妈的，protected 不是子类专用的吗？ 妈的怎么不能调用，===》受保护权限，只能在子类的里面调用！！！调用父类的受保护成员
        //只能在子类里面用，在测试类中通过new对象的方式也是不能调用的
        print();
    }

}
