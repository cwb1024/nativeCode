package cwb.honor.网络编程.TCP通信;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 *
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",6999);//建立连接，同时生成IO流对象

        OutputStream outputStream = socket.getOutputStream();//直接通过get拿到流对象

        outputStream.write("TCP通信，测试一下网络连接是否联通。。".getBytes());

        //用于接收返回信息
        InputStream in = socket.getInputStream();

        byte[] bs = new byte[1024];

        int len = in.read(bs);

        System.out.println(new String(bs,0,len));
    }
}
