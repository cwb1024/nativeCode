package cwb.honor.IO流.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by PC-CWB on 2017/4/11.
 */
public class Sender extends Thread {
    PipedOutputStream out = null;
    public PipedOutputStream getOut(){
        this.out = new PipedOutputStream();
        return out;
    }

    @Override
    public void run() {
        try {
            out.write("我是管道流，我在给你发送消息呢，接收端".getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
