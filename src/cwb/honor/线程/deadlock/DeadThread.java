package cwb.honor.线程.deadlock;

public class DeadThread implements Runnable {
	
	private int i = 0;//i有什么用，用来区别那个线程运行那个？

	public void run() {
		while (true) {
			if (i % 2 == 0) {
				// 先进入A同步，再进入B同步
				synchronized (LockA.locka) {
					System.out.println("A--B--: locka");
					synchronized (LockB.lockb) {
						System.out.println("A--B--:	lockb");
					}
				}
			} else {
				// 先进入B同步，再进入A同步
				synchronized (LockB.lockb) {
					System.out.println("B--A--: lockb");
					synchronized (LockA.locka) {
						System.out.println("B--A--: locka");
					}
				}
			}
			i++;
		}
	}

}
