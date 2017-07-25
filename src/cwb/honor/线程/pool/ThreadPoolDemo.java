package cwb.honor.线程.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK5之后，线程池
 * 使用Executors工具类中的静态方法，创建线程对象，指定个数
 * static ExecutorService new FixedThreadPool(int 个数)
 * 返回ExecutorService接口的实现类(线程对象)
 * @author PC-CWB
 *生成返回值对象的快捷键 	Shift+Alt+L
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
//		System.out.println(newFixedThreadPool);
		newFixedThreadPool.submit(new ThreadPoolRunable());
		newFixedThreadPool.submit(new ThreadPoolRunable());//线程池中两个线程可以提交两次任务
		newFixedThreadPool.submit(new ThreadPoolRunable());
		
		
	}

}
