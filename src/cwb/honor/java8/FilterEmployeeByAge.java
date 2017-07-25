package cwb.honor.java8;

/**
 * Created by PC-CWB on 2017/3/31.
 */
public class FilterEmployeeByAge implements MyFilterInterface<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 25;
    }
}
