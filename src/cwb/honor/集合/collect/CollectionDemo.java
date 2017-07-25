package cwb.honor.集合.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

//		function_1();
//		function_2();
//		function_3();
//		function_4();
//		function_5();
		function_6();
		
	}

	private static void function_6() {
		Collection<Person> coll=new ArrayList<Person>();
		coll.add(new Person("张三", 11, "111@qq.com"));
		coll.add(new Person("李四", 22, "22@qq.com"));
		coll.add(new Person("王五", 33, "131@qq.com"));
		for (Person p : coll) {
			
			System.out.println(p);
		}
	}

	/**
	 * forEach
	 * 优势：简洁
	 * 弊端：没有索引，不能操作容器中的元素
	 */
	private static void function_5() {
		int arr[]={1,2,3,4,5};
		for (int i : arr) {
//			System.out.println(arr[i]);//数组越界异常，i不是索引，是第几个
			System.out.println(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//无异常
		}
	}

	private static void function_4() {
		Collection coll=new ArrayList();
		coll.add(1);
		coll.add("zhangsan");
		coll.add(3.0);
		Iterator iterator = coll.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

	private static void function_3() {
		Collection<String> coll=new ArrayList<String>();
		coll.add("1");
		coll.add("2");
		coll.add("3");
		coll.add("4");
		
		//for比较节省内存，迭代器是一次性的，放在for中，随着for的结束而结束
		for(Iterator<String> it=coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

	private static void function_2() {
		Collection<String> coll = new ArrayList<String>();

		coll.add("zhangsan");
		coll.add("lisi");
		coll.add("lisi");
		coll.add("lisi");
		coll.add("wangwu");
		System.out.println(coll);
		System.out.println(coll.size());
		boolean remove = coll.remove("lisi");//remove 如果有重复值，那么只删除第一个
		System.out.println(remove+" "+coll.size());
		System.out.println(coll);
		boolean removeAll = coll.removeAll(coll);
		System.out.println(coll);
		
	}

	private static void function_1() {
		Collection<String> coll = new ArrayList<String>();

		coll.add("zhangsan");
		coll.add("lisi");
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);
		coll.add("1111111");
		System.out.println(coll);
		boolean contains = coll.contains("1111111");
		boolean contains2 = coll.contains("zhangsan");
		System.out.println(contains);
		System.out.println(contains2);
		System.out.println(coll.size());

		Object[] array = coll.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
