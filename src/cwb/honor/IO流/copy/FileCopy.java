package cwb.honor.IO流.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void copyFile(String fromPath, String toPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis=new FileInputStream(fromPath);
			fos=new FileOutputStream(toPath);

			int len=0;
			while ((len=fis.read())!=-1) {
				//读一个传一个
				fos.write(len);
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("文件复制失败！");
		}finally{
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		long e=System.currentTimeMillis();
		String fromPath="F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.zip";
		String toPath="F:\\MyEclipse2015\\JavaSE\\demo\\b\\a.zip";
		
		copyFile(fromPath, toPath);
		long f=System.currentTimeMillis();
		System.out.println(f-e);//41941ms
		
	}

}
