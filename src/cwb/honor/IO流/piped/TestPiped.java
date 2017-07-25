package cwb.honor.IO流.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by PC-CWB on 2017/4/11.
 * 管道流的主要作用就是可以进行两个线程间的通信。一个线程作为管道输出流，另一个线程作为管道输入流，
 * 在启动线程前，只需要将这两个线程的管道流连接到一起就可以。
 * 这要就很方便的实现了两个线程间的通信。
 */
public class TestPiped {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receive receive = new Receive();
        PipedInputStream pi = receive.getIn();
        PipedOutputStream po = sender.getOut();
        try {
            pi.connect(po);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sender.start();
        receive.start();
    }
}
