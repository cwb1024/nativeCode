package cwb.honor.IO流.piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by PC-CWB on 2017/4/11.
 */
public class Receive extends Thread {
    PipedInputStream in = null;
    public PipedInputStream getIn(){
        this.in = new PipedInputStream();
        return in;
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        try {
            in.read(bytes);
            System.out.println(new String(bytes));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
