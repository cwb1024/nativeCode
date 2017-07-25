package cwb.honor.集合;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by PC-CWB on 2017/4/13.
 */
public class Demo {
    public static void main(String[] args) {
       /* Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2;
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());*/

        //基于索引的删除这种方法会有问题，删完做--，因为删完list的size会变化
       /* List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);

        for (Integer l:list
             ) {
            System.out.println(l);
        }

        list.stream().sorted().forEach(x-> System.out.println(x));

        //Comparable  Comparator*/

        List<Student> list = Arrays.asList(new Student("aaa", 10, 77),
                new Student("dddd", 12, 77),
                new Student("b", 11, 66));


        list.sort((o1, o2) -> {
            if (o1.score == o2.score) {
                return o1.age - o2.age;
            } else {
                return (int) (o1.score - o2.score);
            }
        });

        System.out.println(list);

        List<Student> collect = list.stream().sorted((o1, o2) -> {

            if (o1.score == o2.score) {
                return o1.age - o2.age;
            } else {
                return (int) (o1.score - o2.score);
            }
        }).collect(Collectors.toList());
        System.out.println(collect);

        list.stream().sorted((o1, o2) -> {

            if (o1.score == o2.score) {
                return o1.age - o2.age;
            } else {
                return (int) (o1.score - o2.score);
            }
        }).forEach(System.out::print);
    }


}
