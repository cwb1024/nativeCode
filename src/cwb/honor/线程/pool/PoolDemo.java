package cwb.honor.线程.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用多线程技术求和 一个线程求1+...+100;另一个线程求1+..10; 创建了一个线程池，两个线程对象，为啥这两个线程的运行顺序是确定的。。。？
 * 
 * @author PC-CWB
 *
 */
public class PoolDemo {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		Future<Integer> submit = newFixedThreadPool
				.submit(new Callable<Integer>() {

					@Override
					public Integer call() throws Exception {
						return 1 + 10;
					}
				});
		Future<Integer> submit2 = newFixedThreadPool
				.submit(new Callable<Integer>() {

					@Override
					public Integer call() throws Exception {
						return 1 + 100;
					}
				});
		System.out.println(submit.get());
		System.out.println(submit2.get());
		
		newFixedThreadPool.shutdown();

	}

}
