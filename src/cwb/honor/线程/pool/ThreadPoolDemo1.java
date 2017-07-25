package cwb.honor.线程.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * JDK5之后，线程池
 * 使用Executors工具类中的静态方法，创建线程对象，指定个数
 * static ExecutorService new FixedThreadPool(int 个数)
 * 返回ExecutorService接口的实现类(线程对象)
 * @author PC-CWB
 *生成返回值对象的快捷键 	Shift+Alt+L
 */
public class ThreadPoolDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		Future<String> submit = newFixedThreadPool.submit(new ThreadPoolCallable());
		System.out.println(submit.get());
	}

}
