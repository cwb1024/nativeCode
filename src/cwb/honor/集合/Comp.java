package cwb.honor.集合;

import java.util.Comparator;

/**
 * Created by PC-CWB on 2017/4/13.
 */
public class Comp implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score == o2.score) {
            return o1.age - o2.age;
        } else {
            return (int) (o1.score-o2.score);
        }
    }
}
