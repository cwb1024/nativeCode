package cwb.honor.集合.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		function_1();
		function_2();
		
	}

	//以人作为键存在，要保证map中键 的唯一性，重写hashCode，equals方法
	private static void function_2() {
		HashMap<Person, Integer> map=new HashMap<Person, Integer>();
		map.put(new Person("zhangsan", 1), 1);
		map.put(new Person("lisi", 1), 1);
		map.put(new Person("lisi", 1), 1);
		map.put(new Person("王五", 1), 1);
		map.put(new Person("zhaoliu", 1), 1);
		Set<Person> keySet = map.keySet();
		for (Person person : keySet) {
			Integer value=map.get(person);
			System.out.println(person+" "+value);
		}
		System.out.println("============");
		Set<Entry<Person, Integer>> entrySet = map.entrySet();
		for (Entry<Person, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}

	private static void function_1() {
		HashMap<String,Person> map=new HashMap<String, Person>();
		map.put("a", new Person("zhangsan",11));
		map.put("b", new Person("lisi",14));
		map.put("c", new Person("王五",13));
		map.put("d", new Person("赵六",1));
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			Person value=map.get(string);
			System.out.println(string+" "+value);
		}
		
		Set<Entry<String, Person>> entrySet = map.entrySet();
		for (Entry<String, Person> entry : entrySet) {
			String key=entry.getKey();
			Person value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}
	

}
