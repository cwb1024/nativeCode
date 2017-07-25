package cwb.honor.IO流.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_1 {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.txt");
			fw = new FileWriter("F:\\MyEclipse2015\\JavaSE\\demo\\b\\a.txt");
			char[] buf = new char[1024];
			int len = 0;
			while ((len=fr.read(buf))!=-1) {
				fw.write(buf,0,len);
				fw.flush();
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally{
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
