package cwb.honor.compare;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by PC-CWB on 2017/3/31.
 */
public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts1=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                return s1.age > s2.age ? 1 : -1;
            }
        });

        ts1.add(new Student("mm",21,97005));
        ts1.add(new Student("jerry",19,97003));
        ts1.add(new Student("tom",16,97004));
        ts1.add(new Student("mm",28,97008));
        ts1.add(new Student("mm",23,97006));

        System.out.println("语句return s1.age > s2.age ? 1 : -1;是按照？？？排列的：");
        for (Student s:ts1) {
            System.out.println(s);
        }
    }
}
