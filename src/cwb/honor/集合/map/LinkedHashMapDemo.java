package cwb.honor.集合.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> link=new LinkedHashMap<String, Integer>();
		link.put("a", 1);
		link.put("b", 2);
		link.put("c", 3);
		link.put("d", 4);
		link.put("d", 4);
		link.put("d", 4);
		System.out.println(link);
	}

}
