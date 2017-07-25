package cwb.honor.线程.awake;


public class InputThread implements Runnable {

	private Resourse r;
	
	public InputThread(Resourse r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		int i=0;
		while (true) {
			synchronized(r){		//这里为什么不用this,而是用r,资源锁,资源的唯一性，锁唯一，用this，input中input锁
									//output去取资源，只要有锁就可以进入同步代码块中，之所以会出现数据不一致，是因为this在两个中是变化的，是两个不同的值
									//1、资源的唯一性，可以实现
									//2、锁的唯一性，只有锁唯一，才可以体现出同步的用处，否则一个线程一个锁，都去访问资源，数据不一致
				//flag true 不赋值
				if (r.isFlag()) {
					try {
						r.wait();		//永久等待，不会执行下面的方法	为什么用r.wait(),不用会抛出java.lang.IllegalMonitorStateException
										//为什么r可以调用，因为wait(),对象是object的，任何对象都可以调用。
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if (i%2==0) {
					r.setName("张三");
					r.setGender("男");
				}else{
					r.setName("lisi");
					r.setGender("nv");
				}
				r.setFlag(true);
				r.notify();			//为什么用r.notify()，同上
			}
			i++;
		}
	}
}
