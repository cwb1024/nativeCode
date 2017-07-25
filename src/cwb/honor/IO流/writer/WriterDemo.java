package cwb.honor.IO流.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流，局限性 只能写文本文件，不能写图片，歌曲，视频
 * @author PC-CWB
 *
 */
public class WriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.txt");
		char c [] =new char[]{'a','b','c','d','e'};
		fw.write(c);
		fw.write(c, 2, 2);
		fw.write("hello", 0, 2);
		fw.append('r');
		fw.append("haohao",0,2);
		System.out.println(fw.getEncoding());//utf-8
		
		fw.flush();
		fw.close();
	}

}
