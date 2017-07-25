package cwb.honor.集合;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by PC-CWB on 2017/4/11.
 */
public class TestCollection {
    public static void main(String[] args) {
        function_1();
    }

    private static void function_1() {
        Properties properties = new Properties();
        String path = "F:" + File.separator + "wenjian" + File.separator + "pro.properties";
        File file = new File(path);
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String name = properties.getProperty("aaa", "默认没有值");

        System.out.println(name);
    }
}
