package cwb.honor.IO流.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	/**
	 *  bufferedWriter  newline 可以写换行数据
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\3.txt";
		BufferedWriter bw=new BufferedWriter(new FileWriter(filePath));
		bw.write("张三你好！");
		bw.flush();
		bw.write("可以，你很棒哦！".toCharArray());
		bw.flush();
		bw.newLine();
		bw.write("可以第二行写数据了。。。。");
		bw.close();
	}

}
