package cwb.honor.案例;

/**
 * Created by PC-CWB on 2017/4/8.
 */
public class Chushi extends Employee implements VIP {
    public Chushi() {
    }

    public Chushi(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Chushi的工作是做菜");
    }

    @Override
    public void services() {
        System.out.println("Chushi的VIP服务是做菜加量");
    }
}
