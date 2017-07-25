package cwb.honor.线程.awake;

public class OutputThread implements Runnable{

	private Resourse r ;
	
	public OutputThread(Resourse r) {
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			synchronized(r){
				if (!r.isFlag()) {
					try {r.wait();} catch (InterruptedException e) {e.printStackTrace();}
				}
			System.out.println(r.getName()+","+r.getGender());
			r.setFlag(false);
			r.notify();
			}
		}
	}

}
