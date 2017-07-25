package cwb.honor.集合.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map	API
 * 		增强for不能遍历map,将map转换为set去遍历set
 * @author PC-CWB
 *
 */
public class MapDemo {

	public static void main(String[] args) {
//		function_1();
//		function_2();
		function_3();
		
	}

	private static void function_3() {
		Map<String,String> map=new HashMap<String, String>();
		map.put("q", "qqq");
		map.put("w", "qqq");
		map.put("e", "rrr");
		map.put("r", "rrr");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}

	private static void function_2() {
		Map<String,String> map=new HashMap<String, String>();
		map.put("q", "qqq");
		map.put("w", "qqq");
		map.put("e", "rrr");
		map.put("r", "rrr");	
		map.put("r", "rrtt");	
		
		//map的遍历,不能直接遍历，没有迭代器，转换成为set集合来遍历，set就是一个list
		Set<String> keySet = map.keySet();
		Iterator<String> it=keySet.iterator();
		while (it.hasNext()) {
			String string = it.next();
			String value=map.get(string);
			System.out.println(string+" "+value);
		}
		
		for (String string : keySet) {
			String value=map.get(string);
			System.out.println();
		}		
	}

	private static void function_1() {
		Map<String,String> map=new HashMap<String, String>();
		map.put("q", "qqq");
		map.put("w", "qqq");
		map.put("e", "rrr");
		map.put("r", "rrr");	
		map.put("r", "rrtt");
		String remove = map.remove("e");
		System.out.println(remove);
	}

}
