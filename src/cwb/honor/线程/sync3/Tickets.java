package cwb.honor.线程.sync3;
/**
 * 在方法前边加上synchronized关键字修饰该方法为线程同步方法
 * 如果是静态的方法，还有同步锁吗，有，但绝对不是this，static是类中的方法，而this是对象中的
 * 那么同步锁是谁，	本类.class
 * 为什么这么写？？	类的加载和反射。
 * @author PC-CWB
 *
 */
public class Tickets implements Runnable {

	private	static int tickets = 100;
	
	@Override
	public void run() {
		while (true) {
			payTickets();
		}
	}
	
	public static synchronized void payTickets() {
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
