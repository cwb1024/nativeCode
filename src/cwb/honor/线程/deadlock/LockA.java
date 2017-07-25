package cwb.honor.线程.deadlock;
/**
 * ]这个A锁，现在仅仅代表共享资源
 * @author PC-CWB
 *
 */
public class LockA {
	
	/**
	 * A锁，想要用A中的数据，怎么保证A锁的唯一性，构造方法的私有化
	 * 为什么要用构造方法私有化，单例模式，即限制类对象的产生，一个类对象只允许有一个实例，这样就保证了唯一性
	 * 外边不能new，那么我怎样拿到这个对象，本类可以new，那么我可以通过静态，类名.对象
	 * 
	 */
	
	private LockA(){
		
	}
	/**
	 * 构造方法私有化，不能再外部通过new对象实例化这个锁
	 */
	public static final LockA locka=new LockA();
	
	

}
