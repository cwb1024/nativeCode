package cwb.honor.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by PC-CWB on 2017/3/31.
 *
 * Java8 内置的四大核心接口
 *
 *      Consumer<T>:消费型接口       有去无回
 *          void accept(T t);
 *
 *      Supplier<T>:供给型接口
 *          T get();
 *
 *      Function<T,R>:函数型接口
 *          R apply(T t);
 *
 *      Predicate<T>:断言型接口
 *          boolean test(T t);
 */


public class TestLampda3 {

    @Test
    public void test1() {
        Consumer<String> consumer = x -> System.out.println(x+"喜欢大宝剑，消费很开心");
        consumer.accept("张三");
    }

    public List<Integer> getList(int num,Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    //用于产生一些对象，自己定义怎么产生
    @Test
    public void test2() {
        List<Integer> list = getList(10, () -> (int) (Math.random() * 100));
        for (Integer i: list) {
            System.out.print(i+",");
        }
    }

    public String getStr(String str,Function<String,String> fun){
        return fun.apply(str);
    }
    @Test
    public void test3() {
        String hello = getStr("hello", x -> x + "zhangsna");
        System.out.println(hello);

        String str = getStr("\t\t\thahahah  ", x -> x.trim());
        System.out.println(str);
    }


    //将满足条件的字符串加入集合中
    public List<String> getList(List<String> list, Predicate<String> predicate) {
        List<String> strings = new ArrayList<>();
        for (String s:list) {
            if (predicate.test(s)) {
                strings.add(s);
            }
        }
        return strings;
    }

    List<String> data = Arrays.asList(
            "qwer",
            "qwer1",
            "qw",
            "w"
    );

    @Test
    public void test5(){
        List<String> filter = getList(data, x -> x.length() < 3);
        System.out.println(filter);
    }

    @Test
    public void test4(){
        Predicate<String> predicate = x -> {
            if (x.compareTo("zhangsan") > 0) {
                return true;
            }else{
                return false;
            }
        };
        boolean lisi = predicate.test("lisi");
        System.out.println(lisi);

    }
}
