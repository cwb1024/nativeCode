package cwb.honor.集合.collect.list.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo1 {

	public static void main(String[] args) {
		Collection<Integer> coll=new ArrayList<Integer>();
		Collection<String> coll1=new ArrayList<String>();
		coll.add(1);
		coll.add(2);
		coll1.add("zhangsan");
		coll1.add("lisi");
		
		ArrayIterator(coll);
		ArrayIterator(coll1);
	}
	private static void ArrayIterator(Collection<?> coll) {
		Iterator<?> it=coll.iterator();
		for (Object obj : coll) {
			System.out.println(obj);
		}
	}
}
