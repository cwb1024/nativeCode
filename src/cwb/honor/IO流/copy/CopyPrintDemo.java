package cwb.honor.IO流.copy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyPrintDemo {

	public static void printCopyFiles(String fromPath,String toPath) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(fromPath),"GBK"));
		PrintWriter pw=new PrintWriter(new FileOutputStream(toPath),true);
		String line=null;
		while ((line=br.readLine())!=null) {
			pw.println(line);
		}
		pw.close();
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		String fromPath = "F:\\MyEclipse2015\\JavaSE\\demo\\1.txt";
		String toPath = "F:\\MyEclipse2015\\JavaSE\\demo\\b\\18.txt";
		printCopyFiles(fromPath, toPath);
	}

}
