package cwb.honor.IO流.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		long e=System.currentTimeMillis();
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\3.txt";
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(filePath));
		bos.write("work for everyday!".getBytes());
		bos.close();
		/*FileOutputStream fos=new FileOutputStream(filePath);
		fos.write("work for everyday!".getBytes());
		fos.close();*/
		long f=System.currentTimeMillis();
		System.out.println(f-e);
	}

}
