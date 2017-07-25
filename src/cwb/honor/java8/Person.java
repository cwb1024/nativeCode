package cwb.honor.java8;

/**
 * Created by PC-CWB on 2017/3/31.
 */
public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+","+age;
    }
}
