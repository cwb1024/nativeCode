package cwb.honor.compare;

/**
 * Created by PC-CWB on 2017/3/31.
 */
public class Student implements Comparable {
    String name;
    int age;
    int classNum;

    public Student() {
    }

    public Student(String name, int age, int classNum) {
        this.name = name;
        this.age = age;
        this.classNum = classNum;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", classNum="
                + classNum + "]";
    }

    @Override
    public int compareTo(Object o) {
        Student  s= (Student) o;
        return this.classNum - s.classNum;
    }
}
