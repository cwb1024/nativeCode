package cwb.honor.线程;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		SonThread st=new SonThread();
		Thread t=new Thread(st);
		t.start();
		for (int i = 0; i <	50; i++) {
			System.out.println("main     "+   i);
			Thread.sleep(10);
		}

	}


}
