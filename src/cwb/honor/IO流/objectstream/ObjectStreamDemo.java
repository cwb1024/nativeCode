package cwb.honor.IO流.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * IO流对象，实现person实体类的序列化与反序列化 ObjectOutputStream 写对象，序列化 ObjectInputStream
 * 读对象，反序列化 对象的序列化与反序列化究竟有什么用呢？对象中的数据从哪里存储？数据库返回一个对象，存储到本地？是读流快还是读数据库快？
 * 
 * 对象的序列化，是对对象的序列化，静态变量属于类的成员，不能序列化。【==静态不能序列化==】
 * 【瞬态序列化】transient 阻止成员的序列化         有什么有？
 * 
 * Serializable	没有抽象方法，这个接口是标记接口，有什么用？被标记了，就可以序列化
 * 
 * 序列化冲突问题：更改person类源码，比如讲private修饰，改为public ，增加属性
 * 解决方法（要求不在序列化对象，也能反序列成功！）--->避免序列号冲突	,添加一个序列号，相当于自定义了一个序列号，
 *
 * 读的时候，本地需要有class文件，没有文件会报错
 * @author PC-CWB
 *
 */

public class ObjectStreamDemo {
	/**
	 * 对象的序列化
	 * 
	 * @param pathName
	 * @throws IOException
	 */
	public static void objectWrite(String pathName) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				pathName));
		oos.writeObject(new Person("张三", 10, "男")); // 对象应该实现序列化接口
		oos.close();
		// 序列化之后是一些看不懂的文本，
	}

	/**
	 * 对象的反序列化，拿到对象
	 * 
	 * @param pathName
	 * @throws IOException
	 * @throws ClassNotFoundException
	 *             这个异常是什么原因？必须有person.class文件，没有这个文件是不可以反序列化的
	 */
	public static void objectRead(String pathName) throws IOException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				pathName));
		/*Person p=new Person();
		p=(Person) ois.readObject();
		System.out.println(p.toString());*/
		Object obj =  ois.readObject();
		System.out.println(obj.toString());
		ois.close();
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		String pathName = "F:\\MyEclipse2015\\JavaSE\\demo\\obj.txt";
//		 objectWrite(pathName);
		objectRead(pathName);

//		function();
	}

	@Test
	public void function() throws IOException, ClassNotFoundException {
		String pathName = "F:\\MyEclipse2015\\JavaSE\\demo\\obj.txt";
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(pathName));
		oos.writeObject(new Person());

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathName));
		Object o = ois.readObject();
		System.out.println(o);
	}
}
