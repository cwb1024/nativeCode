package cwb.honor.IO流.reader;

import java.io.FileReader;
import java.io.IOException;

public class IOReaderArray {

	public void fileReader() {
		try {
			FileReader fr = new FileReader("demo.txt");
			fr.read();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOReaderArray reader = new IOReaderArray();
		reader.fileReader();
	}

}
