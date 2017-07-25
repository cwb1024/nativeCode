package cwb.honor.集合.collect.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author PC-CWB
 *
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		// function_1();
		function_2();
		function_3();
		
	}

	/**
	 * 利用Collections的工具类，对list集合进行随机的排列
	 */
	private static void function_3() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(88);
		Collections.shuffle(list);
		System.out.println(list);
	}

	/**
	 * collections,binarySearch静态方法 对list集合进行二分查找，传递List集合，传递被查找的元素
	 */
	private static void function_2() {
		List<String> list = new ArrayList<String>();
		list.add("cwb");
		list.add("honor");
		list.add("collections");
		list.add("list");
		int binarySearch = Collections.binarySearch(list, "r");//返回值是一个负数，表示不存在。
		System.out.println(binarySearch);
	}

	// 多态调用的弊端，不能调用实现类的特有方法
	/**
	 * collection 的 sort 方法 ， 排序 ，由于排序需要用到索引，需要换位置，所以只能对list及其子类使用,进行升序排列
	 * 工具类，当然是要用工具类来调用，用工具类对现有的list集合进行排序
	 */
	private static void function_1() {
		List<String> list = new ArrayList<String>();
		list.add("w");
		list.add("eee");
		list.add("eee");
		list.add("ewqe");
		list.add("QQQQQ");
		// Collections.sort(list);
		System.out.println(list);
	}

}
