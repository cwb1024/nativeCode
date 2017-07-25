package cwb.honor.IO流.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符读取流读取文本文件，文本文件，用记事本打开可以看得懂的（无乱码，不仅仅包括txt,像sql,什么的都是文本文件）
 * 
 * 字符输入流，不能够读取图片
 * @author PC-CWB
 *
 */

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		long e=System.currentTimeMillis();
		FileReader fr=new FileReader("F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.txt");
		char [] c=new char[1024];
		int len=0;
		while ((len=fr.read(c))!=-1) {
			System.out.print(new String(c,0,len) );
		}
		long f=System.currentTimeMillis();
		System.out.println("\n");
		System.out.println("-------------");
		System.out.println(f-e);
	}
}
