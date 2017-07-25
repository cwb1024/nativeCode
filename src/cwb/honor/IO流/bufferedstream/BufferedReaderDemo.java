package cwb.honor.IO流.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	/**
	 * 字符输入流，高效流 bufferedReader,有读一行的方法
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int lineNum = 0;
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\3.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;
		while ((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + ":   " + line);
		}
		br.close();
	}
}
