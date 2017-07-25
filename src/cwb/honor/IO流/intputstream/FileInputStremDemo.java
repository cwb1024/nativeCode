package cwb.honor.IO流.intputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStremDemo {

	/**
	 * intputStream ，加一个数组，起到缓冲的作用，
	 * 
	 * @param pathName
	 */

	public static void readBytes(String pathName) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(pathName);
			int len = 0;
			byte[] bs = new byte[1024];
			while ((len = fileInputStream.read(bs)) != -1) {
				System.out.print(new String(bs,0,len));// admin:zhangsan
															// password:123456
				// System.out.println(bs.toString());//[B@2a139a55
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("流关闭失败！");
				}
			}
		}

	}

	/**
	 * inputStream 读取单个字节
	 * 
	 * @param pathName
	 */
	public static void readByte(String pathName) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(pathName);
			int len = 0;
			while ((len = fileInputStream.read()) != -1) {
				System.out.print((char) len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("流关闭失败！");
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {

		// 输入，从硬盘输入到内存
		String pathName = "F:\\MyEclipse2015\\JavaSE\\demo\\admin.txt";
		readBytes(pathName);
		System.out.println("\n");
		System.out.println("---------------");
		readByte(pathName);

	}

}
