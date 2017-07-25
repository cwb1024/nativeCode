package cwb.honor.IO流.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by PC-CWB on 2017/4/27.
 */
public class UrlTest {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.tjpu.edu.cn");

//        url = new URL("http", "127.0.0.1", 8080, "MvcDemo.user.html");
        InputStream is = url.openStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String str = null;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }

        reader.close();
        is.close();

    }
}
