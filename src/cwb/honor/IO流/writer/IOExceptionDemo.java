package cwb.honor.IO流.writer;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	FileWriter fw;
	public void fileWriter(String filepath){
		try {
			fw=new FileWriter(filepath);
			fw.write("222222222"+LINE_SEPARATOR+"222222222");
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw!=null)
			try {	
				fw.close();
			} catch (IOException e) {
				throw new RuntimeException("关闭失败！") ;
			};
		}
	}
	public static void main(String[] args) throws IOException {
		
		IOExceptionDemo ioWriter=new IOExceptionDemo();
		ioWriter.fileWriter("demo.txt");
	}
}
