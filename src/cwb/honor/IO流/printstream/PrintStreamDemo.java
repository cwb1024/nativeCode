package cwb.honor.IO流.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流	原样输出
 * @author PC-CWB
 *
 */
public class PrintStreamDemo {

	public static void printWrite(String pathName) throws FileNotFoundException{
		PrintWriter pw=new PrintWriter(new File(pathName));
		pw.print(100);		//打印流写入的就是文本
		pw.print("张三");
		pw.write("张三");
		pw.close();
	}
	
	public static void printStream(String pathName) throws IOException{
		PrintStream ps=new PrintStream(new File(pathName));
		ps.print("张三");		//打印汉字不乱码。。。
		ps.write(100);		//写入d		字节流没有写入字符串的功能
		ps.write("李四".getBytes());
		ps.close();
	}
	/**
	 * 打印流刷新功能，自动刷新是一个流对象，必须要有一个流对象
	 * @param pathName
	 * @throws FileNotFoundException
	 */
	public static void printFlash(String pathName) throws FileNotFoundException{
		FileOutputStream fos=new FileOutputStream(pathName);
		PrintStream ps=new PrintStream(fos, true);
		ps.println("dasd");
		ps.println("qweeee");
		ps.println("cccccccccc");
		ps.close();
	}
	public static void main(String[] args) throws IOException {
		String pathName="F:\\MyEclipse2015\\JavaSE\\demo\\print.txt";
		String pathName1="F:\\MyEclipse2015\\JavaSE\\demo\\print1.txt";
		String pathName2="F:\\MyEclipse2015\\JavaSE\\demo\\print2.txt";
//		printWrite(pathName);
		printStream(pathName1);
		printFlash(pathName2);
		
	}

}
