package cwb.honor.IO流.copy;

import java.io.*;

public class FilesCopy {

	/**
	 * 以字节数组的方式，拷贝文件		fos.write(bs,0,len);使用这个方法，一个数组，
	 * @param fromPath
	 * @param toPath
	 */
	public static void copyFiles(String fromPath, String toPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 从fromPath中拿到数据，读到内存中，在从内存中输出到toPath中
		try {
			fis = new FileInputStream(fromPath);
			fos = new FileOutputStream(toPath);

			byte[] bs = new byte[1024*10];
			int len = 0;
			while ((len = fis.read(bs)) != -1) {
				// 读一点拷贝一点
				fos.write(bs,0,len);
			}

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("文件复制失败！");
		} finally {
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args)throws IOException {
		long e=System.currentTimeMillis();
		String fromPath="F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.zip";
		String toPath="F:\\MyEclipse2015\\JavaSE\\demo\\b\\a.zip";
		
		copyFiles(fromPath, toPath);
		copyFiles1(fromPath, toPath);
		long f=System.currentTimeMillis();
		System.out.println(f-e);//55ms


		
	}

	private static void copyFiles1(String fromPath,String toPath) throws IOException {
		InputStream fis = new FileInputStream(fromPath);
		OutputStream fos = new FileOutputStream(toPath);

		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		fis.close();
		fos.close();

	}


	private static void testStream()throws Exception{
		String fromPath="F:\\MyEclipse2015\\JavaSE\\demo\\a\\a.zip";
		String toPath="F:\\MyEclipse2015\\JavaSE\\demo\\b\\a.zip";
		DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fromPath));
		DataInputStream inputStream = new DataInputStream(new FileInputStream(toPath));

		//读的顺序，和写的顺序保持一致
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fromPath)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fromPath)));
		PrintWriter o = new PrintWriter(fromPath, "utf-8");//推荐使用


	}
}
