package cwb.honor.IO流.properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 该集合没有泛型
 * 结合对象，Properties类，继承hashTable,实现map接口，可以和IO对象结合使用，实现数据的持久化保存。
 * 			键名可以是：类名，值：包名	改着比较方便
 * 
 * 特有方法，	load	加载数据，传递任意的字节或者字符输入流。流对象读取文件中的键值对，保存到集合中。(对集合有严格的要求，文本形式，xxx.properties)    
 * 			load(inputStream in)
 * 			load(reader r)
 * 			将持久数据转换成为临时数据
 * xxx.properties中的注释,在开头加#	严格要求
 * @author PC-CWB
 *
 */
public class PropertiesDemo {
	
	public static void function_0() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\pro.properties";
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream(filePath);
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		properties.load(isr);
		System.out.println(properties);//读出的是一个hash表，无序 的集合
		isr.close();
		fis.close();
	}
	/**
	 * store	键值对存回文件
	 * @throws IOException
	 * 再次读入，把文件覆盖了，覆盖的原因是因为写入的时候，没有append，设为TRUE后，不会覆盖
	 * properties.store(out, comments);	comments的内容是注释,写中文会将文本转换成Unicode
	 */
	public static void function_1() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\pro.properties";
		Properties properties=new Properties();
		properties.setProperty("work", "it");
		properties.setProperty("interest", "code");
		properties.setProperty("learn", "java");
		FileWriter fr=new FileWriter(filePath,true);
		properties.store(fr, "coments");
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {
		function_0();
//		function_1();
	}
	
}
