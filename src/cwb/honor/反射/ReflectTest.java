package cwb.honor.反射;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * 伪泛型，编译后的class文件是没有泛型的。	泛型擦除
 * @author PC-CWB
 *
 */
public class ReflectTest {

	public static void main(String[] args) throws Exception {
		ArrayList<String> array=new ArrayList<String>();
		array.add("zhangsan");
		Class c=array.getClass();
		Method method = c.getMethod("add", Object.class);
		method.invoke(array, 111);
		System.out.println(array);
		
		//怎么遍历XXXXXX  没有价值
		for (Object obj : array) {
			System.out.println(obj);
		}
		
		Iterator it=array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
