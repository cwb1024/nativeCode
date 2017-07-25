package cwb.honor.线程.niming;

/**
 * 使用匿名内部类，实现多线程程序 匿名内部类，必须继承父类，或者实现接口 实现方法：new 父类(){ 重写抽象方法 }
 * 
 * @author PC-CWB
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {

		//extends
		new Thread() {
			public void run() {
				System.out.println("匿名内部类，实现多线程----extend！");
			}
		}.start();

		//接口
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("impl1");
			}
		};
		new Thread(r).start();
		//接口
		new Thread(new Runnable() {
			public void run() {
				System.out.println("impl2");
			}
		}).start();
	}

}
