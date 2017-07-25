package cwb.honor.集合.collect.list.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
	/**
	 * 泛型，解决了强转问题。比如存储的是object类型，一些存储String ，一些存储int，求长度 异常
	 * 固定住数据类型，避免了object类型的安全问题(强转的时候发生的一些)，同时可以使用forEach进行遍历
	 * 编译之后的.class文件是没有泛型概念的。
	 * 什么时候使用上帝类型？
	 * @param args
	 */

	public static void main(String[] args) {
//		function();
//		function_1();
		function_2();
	}

	private static void function_2() {
		Collection<Integer>	coll=new ArrayList<Integer>();
		coll.add(1);
		coll.add(11);
		coll.add(111);
		Integer [] a=new Integer[coll.size()];
		coll.toArray(a);
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}

	private static void function_1() {
		Collection<String> coll=new ArrayList<String>();
		coll.add("zhansann");
		coll.add("zhans");
		coll.add("zhaann");
		Iterator<String> iterator = coll.iterator();
		while (iterator.hasNext()) {
			String s= iterator.next();
			System.out.println(s.length());
	}
	}

	private static void function() {
		Collection coll=new ArrayList();
		coll.add("zhansann");
		coll.add("zhans");
		coll.add("zhaann");
		coll.add(1);
		Iterator iterator = coll.iterator();
		while (iterator.hasNext()) {
			String s=(String) iterator.next();
			System.out.println(s.length());//java.lang.ClassCastException
		}
	}
	
}
