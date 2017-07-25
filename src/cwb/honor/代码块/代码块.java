package cwb.honor.代码块;

/**
 * Created by PC-CWB on 2017/4/5.
 * 代码块用来限制变量的范围。出去这个范围作用域失效。
 */
public class 代码块 {
    public static void main(String[] args) {
        {
            int 啊=1;
            System.out.println(啊);
        }

    }
}
