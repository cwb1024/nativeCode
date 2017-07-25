package cwb.honor.IO流.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String pathName = "F:\\MyEclipse2015\\JavaSE\\demo\\1.txt";
		FileOutputStream stream = new FileOutputStream(pathName);
		// stream.write(100);//转换成二进制存储，100--> d 1--> 没有
		byte[] bytes = { 65, 66, 67, 68, 69 };// ABCDE
		byte[] byte1 = { -65, -66, -67, -68,-69};//负数是汉字,汉字是2字节，如果写的个数是奇数，不全会出现？
		//stream.write(bytes);
		/*stream.write(bytes);		//ABCDE
		stream.write(bytes, 0, 2);	//ABCDEAB     如果写中文，当前奇数个字节，再写入两个字节，他会继续取两个字节组成汉字，最后？
		//汉字的一些处理
		stream.write(byte1);			//烤郊?
		stream.write(byte1,0,2);		//烤郊豢?
		//测试
		byte[]byte2={-69,-65};
		stream.write(byte2);		//豢
*/		
		//输入字符串
		stream.write("hello".getBytes());//字符串转换成字节数组
		stream.close();			
	}

}
