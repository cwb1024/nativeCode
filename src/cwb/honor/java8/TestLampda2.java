package cwb.honor.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by PC-CWB on 2017/3/31.
 * Lampda表达式，  ->
 * 需要接口的支持
 * 左侧：参数列表，对应着接口中参数列表的参数列表
 * 右侧：表达式所需执行的功能，Lampda体    接口抽象方法所需要实现的功能
 * <p>
 * 那么如果接口中有多个抽象方法，那么默认实现那个呢？    需要函数式接口的支持(接口中只有一个抽象方法)
 * <p>
 * 一：语法格式：
 * 格式1、无参数，无返回值  （） -> System.out.println("---");
 * 格式2、有一个参数，无返回值
 * 格式3、如果只有一个参数，小括号可以省略不写  x->System.out.println("---");
 * 格式4、有两个以上的参数，有返回值，并且Lampda体中，有多条语句,大括号
 * 格式5、有两个以上的参数，有返回值，并且Lampda体中，只有一条语句， return ，{} 都可以省略
 * 格式6、Lampda表达式参数列表可以省略不写，因为JVM编译器可以通过上下文推断出，数据类型，即 “类型推断”
 * <p>
 * 左右遇一括号省
 * 左侧推断类型省
 * 二：Lampda表达式需要函数式接口的支持：
 * 函数式接口：接口中只有一个抽象方法的接口，函数式接口。可以使用注解 @FunctionalInterface
 * 可以检查是否是函数式接口
 */
public class TestLampda2 {
    @Test
    public void test1() {
        int num = 1;
        Runnable runnable = () -> System.out.println("无参数，无返回值 ");
        Thread thread = new Thread(runnable);
        thread.start();

        MyTest myTest = () -> System.out.println("------");
        myTest.mytest1();
    }

    @Test
    public void test2() {
        Consumer<String> consumer = (x) -> System.out.println("打印传入的参数： " + x);
        consumer.accept("有一个参数，无返回值");
    }

    @Test
    public void test3() {
        Consumer<String> consumer = x -> System.out.println("打印传入的参数： " + x);
        consumer.accept("有一个参数，无返回值，如果只有一个参数，小括号可以省略不写");
    }

    @Test
    public void test4() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    @Test
    public void test5() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        System.out.println(com.compare(-9, -7));
    }

    @Test
    public void test6() {
        Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(x, y);
        System.out.println(com.compare(-9, -7));
    }

    public Integer operation(Integer a, MyTest2 myTest2) {
        return myTest2.getValue(a);
    }

    @Test
    public void test7() {
        MyTest2 myTest2 = (a) -> a * a;
        Integer value = myTest2.getValue(3);
        System.out.println(value);

        System.out.println("-----------");

        Integer operation = operation(50, (s) -> s * s);
        System.out.println(operation);


    }

    List<Employee> data = Arrays.asList(
            new Employee("aaa", 38, 1000.0),
            new Employee("bbb", 19, 1200.0),
            new Employee("ccc", 50, 1300),
            new Employee("ddd", 47, 900.0),
            new Employee("zzz", 25, 600.0),
            new Employee("zzzz", 25, 600.0)
    );

    @Test
    public void test8() {
        Collections.sort(data, (x, y) -> {
            if (x.getAge() == y.getAge()) {
                return x.getName().compareTo(y.getName());
            } else {
                return Integer.compare(x.getAge(), y.getAge());
            }
        });

        for (Employee emp : data) {
            System.out.println(emp.toString());
        }
    }

    @Test
    public void test9() {
        Collections.sort(data, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            }
        });

        for (Employee emp : data) {
            System.out.println(emp.toString());
        }
    }

    List<Person> peoples = Arrays.asList(
            new Person("zhangsan1", 21),
            new Person("zhangsan2", 21),
            new Person("zhangsan0", 22),
            new Person("zhangsan1", 22)
    );

    @Test
    public void test10(){
        Collections.sort(peoples, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age == o2.age) {
                    return o1.name.compareTo(o2.name);
                } else {
                    return Integer.compare(o1.age, o2.age);
                }
            }
        });

        for (Person p : peoples) {
            System.out.println(p.toString());
        }
    }

    @Test
    public void test11(){
        Collections.sort(peoples,(x,y)->{
            if (x.age == y.age) {
                return x.name.compareTo(y.name);
            } else {
                return Integer.compare(x.age, y.age);
            }
        });

        for (Person p:peoples) {
            System.out.println(p.toString());
        }
    }



    List<Person> data1 = Arrays.asList(
            new Person("zhangsan1", 21),
            new Person("zhangsan2", 22),
            new Person("zhangsan0", 13),
            new Person("zhangsan1", 24)
    );

    @Test
    public void test12(){
       Collections.sort(data1, new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               if (o1.name.equals(o2.name)) {
                   return o1.age - o2.age;
               } else {
                   return o1.name.compareTo(o2.name);
               }

           }
       });
        for (Person p: data1) {
            System.out.println(p.toString());
        }
    }

    public String operateStr(String str,MyFunc func){
        return func.getValue(str);
    }

    @Test
    public void test13(){
        String s = operateStr("zhsnga  san ", (x) -> x.toUpperCase());
        String s1 = operateStr("\t\t\t sss haha ", x -> x.trim());
        String goodlo = operateStr("goodlo", x -> x.substring(1, 2));
        String dsadasfasf = operateStr("dsadasfasf", x -> x.charAt(3) + "");
        String s2 = operateStr("sadasdasd", x -> x.indexOf('a') + "");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(goodlo);
        System.out.println(dsadasfasf);
        System.out.println(s2);
    }

    @Test
    public void test14(){
        MyFunc1<String, String> myFunc1 = (x, y) -> x + y;
        System.out.println(myFunc1.getValue("zhangsan","lisi"));

        MyFunc1<StringBuffer, String> func1 = (x, y) -> x.append(y).toString();
        System.out.println(func1.getValue(new StringBuffer("aaa"), new StringBuffer("bbb")));
    }

    //*************************以上都是自定义的接口，艹，巨麻烦*****************************//

    //*************************java8  四大内置接口 转TestLampda3*****************************//
}
