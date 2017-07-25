package cwb.honor.IO流.bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\3.txt";
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				filePath));
		byte[] bytes = new byte[10];
		int len = 0;
		while ((len=bis.read(bytes)) != -1) {
			System.out.print(new String(bytes,0, len));
		}
		bis.close();
	}
}
