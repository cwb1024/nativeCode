package cwb.honor.案例;

/**
 * Created by PC-CWB on 2017/4/8.
 */
public class JingLi extends Employee {

    private double money;

    public JingLi() {
    }

    public JingLi(String name, String id,double money) {
        super(name, id);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void work() {
        System.out.println(getName()+","+getId()+"经理的工作是管理");
    }
}
