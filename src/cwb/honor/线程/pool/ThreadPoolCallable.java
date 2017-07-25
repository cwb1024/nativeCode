package cwb.honor.线程.pool;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "callable";
	}

}
