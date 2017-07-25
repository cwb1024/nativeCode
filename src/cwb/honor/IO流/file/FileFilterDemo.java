package cwb.honor.IO流.file;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo implements FileFilter {

	@Override
	public boolean accept(File arg0) {
		if (arg0.isDirectory()) {
			return true;
			//如果是文件夹，也得装进去，为了遍历全部的，否则，装不进去，没有文件夹，则不能遍历全部
		}
		return arg0.getName().toLowerCase().endsWith(".java");
		//endsWith是一个boolean类型，这个过滤器，只要返回boolean即可，而不是纠结getName的返回值
	}

}
