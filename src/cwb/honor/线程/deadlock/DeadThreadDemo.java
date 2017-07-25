package cwb.honor.线程.deadlock;

public class DeadThreadDemo {

	public static void main(String[] args) {
		
		DeadThread dead = new DeadThread();
		//为啥两个线程只调用一个run方法？？？
		Thread t0 = new Thread(dead);
		Thread t1 = new Thread(dead);
		t0.start();
		t1.start();
	}

}
