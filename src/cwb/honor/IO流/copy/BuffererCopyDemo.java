package cwb.honor.IO流.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BuffererCopyDemo {
	/**
	 * 利用bufferedReader,bufferWriter 实现文件的拷贝 ,用bufferedReader读出现乱码，怎么解决
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws IOException
	 */
	/**
	 * 缓冲流   转换流  字节流
	 * @param fromPath
	 * @param toPath
	 * @throws IOException
	 */
	public static void copyFiles_1(String fromPath,String toPath) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(fromPath),"GBK"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(toPath),"GBK"));
		String line=null;
		while ((line=br.readLine())!=null) {//读完之后，最后多一行空格，多两个字节，通过转换流，解决了字符乱码的情况
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		
	}
	/**
	 * windows通过新建的形式采用默认GBK,以UTF-8读取，拿到的数据本来就是乱码
	 * @param fromPath
	 * @param toPath
	 * @throws IOException
	 */
	public static void copyFiles_2(String fromPath,String toPath) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(fromPath));
		BufferedWriter bw=new BufferedWriter(new FileWriter(toPath));
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	/**
	 * windows通过新建的形式采用默认的GBK,以GBK的形式读取，正常文本，再以UTF-8形式写入，不乱码。
	 * @param fromPath
	 * @param toPath
	 * @throws IOException
	 */
	public static void copyFiles_3(String fromPath,String toPath) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(fromPath),"GBK"));
		BufferedWriter bw=new BufferedWriter(new FileWriter(toPath));
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		long e = System.currentTimeMillis();
		String fromPath = "F:\\MyEclipse2015\\JavaSE\\demo\\1.txt";
		String toPath = "F:\\MyEclipse2015\\JavaSE\\demo\\b\\14.txt";
		
//		copyFiles_1(fromPath, toPath);//采用转换流的方式以GBK的方式读取，拿到的是不乱码
//		copyFiles_2(fromPath, toPath);//出现乱码，因为此时系统的编码方式是GBK,fileReader以UTF-8的方式读入就是乱码，再将乱码写入文本文件还是乱码	
		copyFiles_3(fromPath, toPath);
		long f = System.currentTimeMillis();
		System.out.println(f - e);
	}

}
