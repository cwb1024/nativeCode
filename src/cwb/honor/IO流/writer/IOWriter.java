package cwb.honor.IO流.writer;

import java.io.FileWriter;
import java.io.IOException;

public class IOWriter {
	FileWriter fileWriter;
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public void fileWriter(String filepath){
		try {
			fileWriter=new FileWriter(filepath);
			fileWriter.write("ab");//写到缓冲区中
			fileWriter.flush();//再从缓冲区中读出到文件中
			//都是windows的写入数据的方式，占用了资源
			//fileWriter.close();//在调用close方法时，会将数据刷新到文件中，即使不调用flush
			//fileWriter.write("hahahhaahhah");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		
		IOWriter ioWriter=new IOWriter();
		ioWriter.fileWriter("demo.txt");
	}
}
