package cwb.honor.线程.awake;

public class AwakeThreadDemo {

	public static void main(String[] args) {
		
		Resourse r=new Resourse();
		
		InputThread in=new InputThread(r);
		OutputThread out=new OutputThread(r);
		
		Thread t1=new Thread(in);
		Thread t2=new Thread(out);
		
		t1.start();
		t2.start();
	}

}
