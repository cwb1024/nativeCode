package cwb.honor.集合.collect.list.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型的限定
 * Collection<? extends Employee> 传谁不知道，我只知道你需要给我传一个继承Employee的对象，其他没有继承的不行
 * ? extends Employee:上限限定，可以传递Employee,Employee的子类
 * ? super Employee:下限限定，可以传递Employee，Employee的父类
 * 这样就解决了安全问题？什么安全问题       假如不继承，那么我可能传入一个非继承Employee的对象，那么调用Employee的方法时可能会出现异常
 * @author PC-CWB
 *
 */

public class WildCardDemo {

	public static void main(String[] args) {
		ArrayList<ChuShi> cs=new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fwy=new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jl=new ArrayList<JingLi>();
		
		cs.add(new ChuShi("厨师1", "001"));
		cs.add(new ChuShi("厨师2", "002"));
		
		fwy.add(new FuWuYuan("服务员1", "0001"));
		fwy.add(new FuWuYuan("服务员2", "0002"));
		
		jl.add(new JingLi("经理1", "01", 100.0));
		jl.add(new JingLi("经理2", "02", 200.0));
		
		ArrayList<String>	as=new ArrayList<String>();
		ArrayIterator(cs);
		ArrayIterator(fwy);
		ArrayIterator(jl);
	}
	

	private static void ArrayIterator(Collection<? extends Employee> coll) {
		Iterator<? extends Employee> it=coll.iterator();
		for (Employee employee : coll) {
			employee.work();
		}
	}

}
