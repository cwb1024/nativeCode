package cwb.honor.集合.collect.set;

import java.util.HashSet;

/**
 * 	对象的hash值，普通的十进制数
 * 	父类Object，方法public int HashCode 计算的int整数
 * @author PC-CWB
 *
 */
public class HashDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person p=new Person();
		Person p1=new Person();
		int hashCode = p.hashCode();
		int hashCode1 = p1.hashCode();
		System.out.println(hashCode);	//自己如果重写了父类的方法，在这里写个固定的，返回调用固定的值，一定是一样的。
		System.out.println(hashCode1);	//两个类对象的hash值确实不一样的。
		
		//String 的hash值算法和类对象的不一样，他自己重写了
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=new String("abc1");	//内容不一样时，hash值也是不一样的。
		
		System.out.println(s1.hashCode());//两个不同的对象，确实相同的hash值，但是String的hash值算法，确实在父类中也是一样的
		System.out.println(s2.hashCode());//h=h*31+val[i] hash值是自己算的，没有用子类的功能，与字符有关，字符相同，那么hash值也是一样的
		System.out.println(s3.hashCode());*/
		
//		function_1();
//		function_2();
		function_3();
		
	}
	
	//要求，将姓名和年龄一样的person，看成是同一个对象
	//判断重复值，必须依赖对象自己的方法，hashCode	equals
	private static void function_3() {
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("a", 1));
		set.add(new Person("b", 2));
		set.add(new Person("c", 3));
		set.add(new Person("d", 4));
		set.add(new Person("d", 4));
		System.out.println(set);
	}

	private static void function_2() {
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("a", 1));
		set.add(new Person("b", 2));
		set.add(new Person("c", 3));
		set.add(new Person("d", 4));
		set.add(new Person("d", 4));
		set.add(new Person("d", 4));
		set.add(new Person("d", 4));
		set.add(new Person("d", 4));//重复值，居然他妈的存进去了，解释,new出来的理论上属于不同的对象
		System.out.println(set);
	}

	/**
	 * HashSet为什么不会存储重复的hash值
	 * 怎么操作的？
	 * 调用对象的hash值，new String("abc").hashCode()=96354;
	 * 集合在容器中找，有没有和这个hash值一样的值，如果没有，就装进去
	 * 如果有，装不装呢？后来的newString("abc").equals(原来的new String("abc"))	true
	 * 两个对象，hash值一样，equals返回的是TRUE，集合判定元素重复
	 *
	 * 又存储了一个对象，集合调用对象的方法，new String("adc").hashCode=96354(可能存在的状态)
	 * 集合去容器中找，有没有96354的对象，找到了。
	 * 集合让后来的对象的equals原来的对象，		= FALSE
	 * 结果：两个对象的哈希值相同，但是equals确实FALSE
	 * 集合判定对象没有重复，采用桶的存储方式。
	 * 【哈希表存储对象的依据】，|||【对象的哈希值，equals】
	 * 存储过程：上来拿到一个对象，算出hashCode 看有没有存在的hashCode，没有直接存储上去
	 * 								 如果有存在的hashCode,比较equals 如果TRUE，判定为重复值，不存储
	 * 															如果FALSE，用桶的方式存储(放在原有对象的下边，像链表一样，这两个hashCode一样，造成链表的持续连接状态)
	 */
	private static void function_1() {
		HashSet<String> set=new HashSet<String>();
		set.add(new String("aaa"));
		set.add(new String("aaa"));
		set.add(new String("bbb"));
		set.add(new String("bbb"));
		System.out.println(set);
	}
	

}
