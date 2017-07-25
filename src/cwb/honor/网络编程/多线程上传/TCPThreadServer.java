package cwb.honor.网络编程.多线程上传;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 * 服务器端多线程，来一个客户端，就开一个线程。
 */
public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7998);
        while (true) {
            //只要获取一个客户端对象，就必须开启一个线程
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();
        }
    }
}
