package cwb.honor.集合.map;

import java.util.Hashtable;

/**
 * HashMap 线程不安全，运行速度快，允许存储null值
 * HashTable 线程安全，运行速度慢，不允许存储null值,正是因为这样，被抛弃，但是他的子类替代了他
 * HashTable  的子类 Properties
 * 
 * @author PC-CWB
 *
 */
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> table=new Hashtable<String, String>();
		table.put(null, null);
//		System.out.println(table);//编译没事，但是输出的时候回出现控制正异常
	}

}
