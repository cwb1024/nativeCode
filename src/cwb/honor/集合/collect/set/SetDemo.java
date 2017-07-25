package cwb.honor.集合.collect.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * set接口特点：不重复元素，没有索引
 * 实现类:HashSet	(哈希表)
 * 特点:无序集合，存储和取出的顺序不同，没有索引，不存储重复元素
 * 代码的编写上，和ArrayList完全一致
 * hashset的底层是一个hashmap	源码：public HashSet(){
 * 									map=new HashMap<~>();
 * 								}
 * @author PC-CWB
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		function_1();
		function_2();
	}

	private static void function_2() {
		//HashSet自己本身的特点，底层数据结构，哈希表(链表数组结合体)(hashTable)，存储，取出都比较快
		
		
	}

	private static void function_1() {//set接口的特性
		Set<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("333");
		set.add("333");
		System.out.println(set);
	}

}
