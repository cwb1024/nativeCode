package cwb.honor.线程.sync2;
/**
 * 在方法前边加上synchronized关键字修饰该方法为线程同步方法
 * 同步方法还有锁吗，肯定有，同步方法中的锁，就是本类对象的引用this
 * 同步锁就是this
 * @author PC-CWB
 *
 */
public class Tickets implements Runnable {

	private int tickets = 100;
	
	@Override
	public void run() {
		while (true) {
			payTickets();
		}
	}
	
	public synchronized void payTickets() {
			if (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()
						+ "出售票->" + tickets--);

			}
	}

}
