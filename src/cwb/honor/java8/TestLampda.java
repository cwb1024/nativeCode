package cwb.honor.java8;

import org.junit.Test;

import java.util.*;

/**
 * Created by PC-CWB on 2017/3/31.
 */
public class TestLampda {

    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        TreeSet<Integer> treeSet = new TreeSet<Integer>(com);

    }

    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> treeSet = new TreeSet<>(com);
    }

    List<Employee> data = Arrays.asList(
            new Employee("aaa", 38, 1000.0),
            new Employee("bbb", 19, 1200.0),
            new Employee("ccc", 50, 1300),
            new Employee("ddd", 47, 900.0),
            new Employee("zzz", 25, 600.0)
    );

    public List<Employee> getEmployeesByAge(List<Employee> employ) {
        List<Employee> emps = new ArrayList<>();
        for (Employee emp : employ) {
            if (emp.getAge() > 25) {
                emps.add(emp);
            }
        }
        return emps;
    }

    public List<Employee> getEmployeesBySalary(List<Employee> employ) {
        List<Employee> emps = new ArrayList<>();
        for (Employee emp : employ) {
            if (emp.getSalary() > 1000) {
                emps.add(emp);
            }
        }
        return emps;
    }

    @Test
    public void test3() {
        List<Employee> employees = getEmployeesByAge(data);
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }


    //优化方式1：策略设计模式，给他什么策略，就按照什么策略过滤
    public List<Employee> filterEmployee(List<Employee> list, MyFilterInterface<Employee> mp) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : list) {
            if (mp.test(emp)) {
                employees.add(emp);
            }
        }
        return employees;
    }


    //优化方式1：策略设计模式，给他什么策略，就按照什么策略过滤
    @Test
    public void Test4() {
        List<Employee> employees = filterEmployee(data, new FilterEmployeeByAge());
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        System.out.println("---------");
        List<Employee> employees1 = filterEmployee(data, new FilterEmployeeBySalary());
        for (Employee emp : employees1) {
            System.out.println(emp.toString());
        }
    }

    //优化方式2：匿名内部类
    @Test
    public void Test5() {
        List<Employee> employees = filterEmployee(data, new MyFilterInterface<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() >= 25;
            }
        });

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    //优化方式3：Lampda表达式
    @Test
    public void test6() {
        List<Employee> employees = filterEmployee(data, (e) -> e.getAge() >= 25);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    //优化方式4：(只有data,没有以上使用的接口，以及实现类) Stream API
    @Test
    public void test7() {
        data.stream().filter((e) -> e.getAge() >= 25).limit(2).forEach(System.out::println);

        System.out.println("----------");

        data.stream().map(Employee::getName).forEach(System.out::println);

    }
}
