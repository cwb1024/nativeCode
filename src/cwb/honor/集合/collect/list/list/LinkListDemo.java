package cwb.honor.集合.collect.list.list;

import java.util.LinkedList;
/**
 * 子类特有功能，不能多态调用，多态调用只是两者的共有功能
 * @author PC-CWB
 *
 */
public class LinkListDemo {

	public static void main(String[] args) {
//		function_1();
//		function_2();
		function_3();		
}
	private static void function_3() {
		LinkedList<String> link=new LinkedList<String>();
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");
		System.out.println(link);
		String string = link.get(2);
		System.out.println(string);
		if(!link.isEmpty()){
		String first = link.getFirst();
		String last = link.getLast();
		System.out.println(first);
		System.out.println(last);
		String remove = link.remove();
		System.out.println(remove);//返回链表结合的开头,并移除头元素
		System.out.println(link);
		}
	}

	private static void function_2() {
		LinkedList<String> link=new LinkedList<String>();
		link.addLast("a");
		link.addLast("b");
		link.addLast("c");
		link.addLast("d");
		System.out.println(link);
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		System.out.println(link);
	}

	private static void function_1() {
		LinkedList<String> list=new LinkedList<String>();
		list.addLast("11");
		list.add("22");
		list.addFirst("33");
		System.out.println(list);
	}
	

}
