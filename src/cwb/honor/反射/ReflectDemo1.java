package cwb.honor.反射;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo1 {

	public static void main(String[] args) throws Exception {
		fun_1();
		fun_2();
	}

    private static void fun_2() throws IOException {
        Properties properties = new Properties();
        InputStreamReader in = new InputStreamReader(ReflectDemo1.class.getClassLoader().getResourceAsStream("pro.properties"),"GBK");
        properties.load(in);
        String className = properties.getProperty("ClassName");
        System.out.println(className);
    }

    private static void fun_1() throws Exception {
        //IO 利用字符输入流，字节输入流都可以
        FileInputStream fr=new FileInputStream("src/pro.properties");
        InputStreamReader isr = new InputStreamReader(fr,"GBK");
        BufferedReader br = new BufferedReader(isr);
        //怎么对转换流进行缓冲
        Properties pro = new Properties();
        pro.load(br);
        br.close();
        isr.close();
        fr.close();
        //Reflect
        Class c=Class.forName(pro.getProperty("ClassName"));
        Method method = c.getMethod(pro.getProperty("MethedName"));
        method.invoke(c.newInstance());
    }
}
