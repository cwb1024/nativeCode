package cwb.honor.集合.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function_1();
	}

	private static void function_1() {
		Map<String, Map<String, String>> cMap = new HashMap<String, Map<String, String>>();
		Map<String, String> sMap1 = new HashMap<String, String>();
		Map<String, String> sMap2 = new HashMap<String, String>();
		sMap1.put("14116500001", "张三1");
		sMap1.put("14116500002", "李四1");
		sMap1.put("14116500003", "王五1");
		sMap1.put("14116500004", "赵六1");
		sMap2.put("14116500001", "张三2");
		sMap2.put("14116500002", "李四2");
		sMap2.put("14116500003", "王五2");
		sMap2.put("14116500004", "赵六2");
		cMap.put("Z1401", sMap1);
		cMap.put("Z1402", sMap2);
		bianli_1(cMap);
//		bianli_2(cMap);
		// System.out.println(cMap);
	}

	private static void bianli_2(Map<String,Map<String,String>> cMap) {
		Set<Entry<String, Map<String, String>>> entrySet = cMap.entrySet();
		for (Entry<String, Map<String, String>> entry : entrySet) {
			Map<String, String> value = entry.getValue();
			Set<Entry<String, String>> entrySet2 = value.entrySet();
			for (Entry<String, String> entry2 : entrySet2) {
				System.out.println(entry.getKey()+"--"+entry2.getKey()+":"+entry2.getValue());
			}
			
		}
	}

	public static void bianli_1(Map<String, Map<String, String>> cMap) {
		Set<String> cSet = cMap.keySet();
		for (String cs : cSet) {
			Map<String, String> sMap = cMap.get(cs);
			Set<String> snane = sMap.keySet();
			for (String ss : snane) {
				System.out.println(cs+"--"+ss + ":" + sMap.get(ss));
			}
		}
	}

}
