package cwb.honor.IO流.bianma;

import java.io.*;

/**
 * 经测试可知，windows方式通过新建的文本，默认编码是GBK  fileReader fileWriter读写的方式是UTF-8
 * @author PC-CWB
 *
 */
public class BianMaDemo {
	
	/**
	 * 采用默认的方式写入文件
	 * @throws IOException
	 */
	public  static void function_1() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\9.txt";
		FileWriter fw=new FileWriter(filePath);
		fw.write("fileReader的方式写入，不能指定编码！");
		fw.flush();
		fw.close();
		
	}
	
	/**
	 * 采用系统默认的方式读取文件
	 * @throws IOException
	 */
	public static void function_2() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\b\\14.txt";
		FileReader fr=new FileReader(filePath);
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.print(line);
			
		}
		br.close();
		fr.close();
	}
	
	
	/**
	 * 以转换流的方式，设置为编码GBK的方式，写入文件，以fileReader方式读出来是乱码。。。
	 * @throws IOException
	 */
	public static void function_3() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\8.txt";
		FileOutputStream fos=new FileOutputStream(filePath);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
		osw.write("这个是不是乱码！new");
		osw.flush();
		osw.close();

	}
	/**
	 * 以GBK的方式读入文件
	 * @throws IOException
	 */
	public static void function_4() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\b\\14.txt";
		FileInputStream fis=new FileInputStream(filePath);
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		BufferedReader br=new BufferedReader(isr);
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.print(line);
		}
		br.close();
		isr.close();
		fis.close();
	}
	/**
	 * GBK的方式读入信息，以utf-8的形式读取，会出现乱码
	 * @throws IOException
	 */
	public static void function_5() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\b\\14.txt";
		FileInputStream fis=new FileInputStream(filePath);
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.print(line);
		}
		br.close();
		isr.close();
		fis.close();
	}
	
	/**
	 * 采用系统UTF-8的方式保存文件，默认方式读取文件
	 * @throws IOException
	 */
	public static void function_6() throws IOException{
		String filePath = "F:\\MyEclipse2015\\JavaSE\\demo\\cc.txt";
		FileReader fr=new FileReader(filePath);
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.print(line);
		}
		br.close();
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {

		//默认方式读，默认方式写	默认方式读，默认方式写，不乱码
		//function_1();
		//function_2();
		//默认方式写，GBK方式读，UTF-8方式读
//		function_4();//以GBK转换读乱码
//		function_5();//以UTF—8的形式读取不乱码
//		function_3();//GBK方式写入
//		function_4();//GBK方式写入，GBK方式读出，不乱码
//		function_5();//GBK方式写入，UTF-8读入  乱码
		
		//读取通过新建windows自己写的
//		function_2();//自己新建方式写入的默认读乱码
//		function_4();//自己新建的方式以GBK方式读出来不乱码
//		function_5();//自己新建的方式以UTF-8方式读出来乱码
//											新建windows文本写入内容	是GBK
		//默认读入一个GBK读入，默认方式写入的文件		FileReader FileWriter都是以UTF-8的形式读取，写入文件
//		function_2();
//		function_4();
//		function_5();
		function_6();	//若系统采用UTF-8的形式保存文本，以fileReader读取就不会乱码，相同的编码类型
	}

}
