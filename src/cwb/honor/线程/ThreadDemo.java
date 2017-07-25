package cwb.honor.线程;

public class ThreadDemo {

/**
 * 执行顺序无规则，怎么和以前的有规则靠边，这么乱，怎么管理
 * new SubThread()  程序执行到这里时，创建了一个新的线程，JVM中多了一条运行路径，此时两条路径都往下走，执行start方法，CPU有了选择权，自行决定执行那个路径
 * 
 * run()方法就是一个普通的方法，不会开启线程（也就是路径），仅仅是普通的调用（JVM调用去执行）。
 * 
 * 而start方法：线程对象通过start()方法开启一个线程	，并让JVM调用run方法在线程中开始执行
 * 
 * 为啥重写run方法？设计线程的时候就是开一个路径，想要运行什么代码就写在run方法中即可，只要写在run中的方法JVM就开辟新路径执行代码
 * @param args
 */
	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.setName("st thread");
		st.start();
		System.out.println(Thread.currentThread().getName());
	}
}
