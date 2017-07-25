package cwb.honor.线程.pool;

public class ThreadPoolRunable	implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"线程提交任务");
	}

}
