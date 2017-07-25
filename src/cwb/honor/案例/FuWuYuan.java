package cwb.honor.案例;

/**
 * Created by PC-CWB on 2017/4/8.
 */
public class FuWuYuan extends Employee implements VIP {

    public FuWuYuan() {
    }

    public FuWuYuan(String name, String id) {
        super(name, id);
    }

    @Override
    public void services() {
        System.out.println("FuWuYuan提供的VIP服务是：给顾客倒酒");
    }

    @Override
    public void work() {
        System.out.println("FuWuYuan的工作是上菜");
    }
}
