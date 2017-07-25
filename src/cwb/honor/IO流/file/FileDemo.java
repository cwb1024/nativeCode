package cwb.honor.IO流.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	/**
	 * 创建一个文件
	 * 
	 * @param pathName
	 */
	public static void createFile(String pathName) {
		File file = new File(pathName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.getName());
	}

	public static void deleteFile(String pathName) {
		File file = new File(pathName);
		if (file.exists()) {
			file.delete();
		} else {
			System.out.println("该文件不存在！");
		}
	}

	/**
	 * 创建一个文件夹
	 * 
	 * @param pathName
	 */

	public static void createDir(String pathName) {
		File file = new File(pathName);
		boolean b = file.mkdirs();
		System.out.println(b);
	}

	/**
	 * 遍历文件夹 file.listfiles 遍历当前文件夹下的全部文件，包括文件夹、文件，没有去把文件中的文件全部遍历出来 遍历出来是文件的绝对路径
	 * 
	 * @param pathName
	 */
	public static void bianliAll_1(String pathName) {
		File file = new File(pathName);
		File[] list = file.listFiles();
		for (File f : list) {
			System.out.println(f);
		}
	}

	/**
	 * 遍历文件夹，返回文件夹的名字，而不是文件的全路径 也不会去遍历文件夹的字目录，只遍历当前文件夹下的全部文件的文件名
	 * 
	 * @param pathName
	 */

	public static void bianliAll_2(String pathName) {
		File file = new File(pathName);
		String[] str = file.list();
		for (String s : str) {
			System.out.println(s);
		}
	}

	/**
	 * 遍历指定路径下的全部文件
	 * 
	 * @param pathName
	 */
	public static void bianliAll_3(String pathName) {
		File file = new File(pathName);
		File[] fileArr = file.listFiles();
		if (fileArr.length != 0) {
			for (File f : fileArr) {
				if (f.isDirectory()) {
					bianliAll_3(f.getAbsolutePath());
				} else {
					System.out.println(f);
				}
			}
		}
	}

	/**
	 * 遍历指定路径下的全部文件，包括 文件夹
	 * 
	 * @param pathName
	 */
	public static void bianliAll_4(String pathName) {
		File file = new File(pathName);
		if (file != null) {
			File[] fileArr = file.listFiles();//拿到的是本机目录的所有文件，根本就不会去关心下面有没有，想遍历递归
			for (File f : fileArr) {
				if (f.isDirectory()) {
					bianliAll_4(f.getAbsolutePath());
				}
				System.out.println(f);
			}
		}
	}

	/**
	 * 遍历指定文件
	 * 
	 * @param pathName
	 */
	public static void bianliJava(String pathName) {
		File file = new File(pathName);
		if (file != null) {
			File[] fileArr = file.listFiles();
			for (File f : fileArr) {
				if (f.isDirectory()) {
					bianliJava(f.getAbsolutePath());
				}
				if (f.getName().toLowerCase().endsWith(".java")) {
					System.out.println(f);
				}
			}
		}
	}

	/**
	 * getName方法
	 * 
	 * @param pathName
	 */
	public static void bianliGetName(String pathName) {
		File file = new File(pathName);
		File[] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			System.out.println(file2.getName());
		}
	}

	/**
	 * 过滤器
	 * 
	 * @param pathName
	 */
	public static void bianliFilter(String pathName) {
		File file = new File(pathName);
		File[] fileArr = file.listFiles(new FileFilterDemo());
		for (File file2 : fileArr) {
			System.out.println(file2);
		}
	}

	/**
	 * 使用过滤器遍历所有的文件
	 * 
	 * @param args
	 */
	public static void bianliAllFilter(File file) {
		if (file != null) {
			File[] fileArr = file.listFiles(new FileFilterDemo());
			for (File f : fileArr) {
				if (f.isDirectory()) {
					bianliAllFilter(f);
				} else {
					System.out.println(f.getName());
				}
			}
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator = File.separator;
		String path = "demo1.txt";
		String folder = "demo11";
		String pathName = "F:" + separator + "MyEclipse2015" + separator
				+ "JavaSE";
		String pathName1 = "F:\\MyEclipse2015\\JavaSE\\demo";
		File file = new File(pathName1);
		// createFile(path);
		// deleteFile(path);
		// createDir(folder);
		// bianliAll_1(pathName);
		// bianliAll_2(pathName);
		// bianliAll_3(pathName1);
		 bianliAll_4(pathName1);
		// bianliJava(pathName1);
		// bianliFilter(pathName1);
		// bianliGetName(pathName1);
		bianliAllFilter(file);
	}

}
