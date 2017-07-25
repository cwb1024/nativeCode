package cwb.honor.线程.sync;

public class Tickets implements Runnable {

	private int tickets = 100;
	Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
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
	}

}
