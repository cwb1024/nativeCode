package cwb.honor.IO流.commonutils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

/**
 * f3找源码
 * @author PC-CWB
 *
 */

public class CommonUtilsDemo {
	
	public static void c_utils_name(String pathName){
		String name=FilenameUtils.getExtension(pathName);
		System.out.println(name);
		
	}
	
	public static void c_utils_getName(String pathName){
		String name=FilenameUtils.getName(pathName);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) throws IOException {
		String fromPath = "F:\\MyEclipse2015\\JavaSE\\demo\\1.txt";
		String fromPath1 = "F:\\MyEclipse2015\\JavaSE\\demo\\a.jpg";
		String fromPath2 = "F:\\MyEclipse2015\\JavaSE\\demo\\a\\b.jpg";
		String fromPath3 = "F:\\MyEclipse2015\\JavaSE\\demo";
		String fromPath4 = "F:\\MyEclipse2015\\JavaSE\\demo\\a";
		c_utils_name("a.txt");
		c_utils_name(fromPath);
		c_utils_getName(fromPath);
		FileUtils.writeStringToFile(new File(fromPath), "工具类写文件就是好用！");
		FileUtils.copyFile(new File(fromPath1), new File(fromPath2));
		FileUtils.copyDirectory(new File(fromPath3), new File(fromPath4));
	}

}
