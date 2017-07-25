package cwb.honor.IO流.reader;

import java.io.FileReader;
import java.io.IOException;

public class IOReader {

	public void fileReader() {
		try {
			FileReader fr = new FileReader("demo.txt");
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				System.out.println((char) ch);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOReader reader = new IOReader();
		reader.fileReader();
	}

}
