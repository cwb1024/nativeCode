package cwb.honor.线程.lock;

public class ThreadSyncDemo {

	public static void main(String[] args) {
		
		Tickets t=new Tickets();//一个对象，用三个线程来操作
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
