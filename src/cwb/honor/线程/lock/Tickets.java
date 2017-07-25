package cwb.honor.线程.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用LOCK锁，进行线程的同步，替换同步代码块，实现线程的安全。 LOCK方法 lock();获取锁 unlock();释放锁
 * 为什么要将锁写在成员变量的位置，不写在run方法中，写在run里边，每次线程调用run方法，会重新new对象，就不是同一个锁
 * 
 * @author PC-CWB
 * 
 *
 */
public class Tickets implements Runnable {

	private int tickets = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			payTickets();
		}
	}

	public void payTickets() {
		lock.lock();
		if (tickets > 0) {
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName() + "出售票->"
						+ tickets--);
			} catch (InterruptedException e) {
			} finally {
				lock.unlock();
			}
		}
	}
}
