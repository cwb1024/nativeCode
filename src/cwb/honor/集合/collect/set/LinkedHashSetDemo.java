package cwb.honor.集合.collect.set;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet 基于链表的哈希表实现
 * 继承自HashSet
 * 自身特性，具有顺序，存储和取出的顺序是相同的，底层是一个双向链表，双向链表可以保证迭代顺序
 * 线程不安全，运行速度快
 * @author PC-CWB
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		function_1();
	}

	/**
	 *	有序的set集合，不允许存放重复值
	 */
	private static void function_1() {
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
		link.add(12);
		link.add(1);
		link.add(133333);
		link.add(133333);
		link.add(14);
		System.out.println(link);
	}
}
