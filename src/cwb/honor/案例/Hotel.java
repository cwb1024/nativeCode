package cwb.honor.案例;

/**
 * Created by PC-CWB on 2017/4/8.
 */
public class Hotel {
    public static void main(String[] args) {
        JingLi jingLi = new JingLi("zhangsan", "001", 4000);
        jingLi.work();
        System.out.println(jingLi.getMoney());
        Employee employee = new Chushi();
        employee.work();
        Chushi chushi = (Chushi) employee;
        chushi.services();
    }
}
