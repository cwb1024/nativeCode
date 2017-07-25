package cwb.honor.集合.collect.list.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 带有索引的操作都要考虑越界问题
 * @author PC-CWB
 *
 */
public class ListDemo {
	public static void main(String[] args) {
//		function_1();
//		function_2();
		function_3();
	}

	private static void function_3() {
		List<String> list=new ArrayList<String>();
		list.add("arg0");
		list.add("arg1");
		list.add("arg2");
		list.add("arg3");
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String s=it.next();			//迭代器并发异常	java.util.ConcurrentModificationException(并发异常)
										//在遍历的过程中，不能修改集合的长度，不允许修改
			if (s.equals("arg3")) {
				list.add(s.toUpperCase());
			}
		}
		System.out.println(list);
	}

	private static void function_2() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Integer set = list.set(1, 10);
		System.out.println(set);
		System.out.println(list);
	}

	private static void function_1() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		List<String> list1=new ArrayList<String>();
		list.add("zhangsna");
		list.add("zhan");
		list.add("zhangsa");
		list.add("sna");
		list1.add("sna1");
		list1.add("sna1");
		System.out.println(list);
		list.add(1, "arg1");
		System.out.println(list);
		list.addAll(list1);
		System.out.println(list);
		String remove = list.remove(0);//返回的是删除 的那个值
		System.out.println(remove);
		System.out.println(list);
	}
}
