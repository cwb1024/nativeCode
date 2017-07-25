package cwb.honor.网络编程.TCP通信;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6999);
        Socket socket = server.accept();
        System.out.println(socket);
        InputStream in = socket.getInputStream();
        byte[] bs = new byte[1024];
        int len = in.read(bs);
        System.out.println(new String(bs,0,len));
        OutputStream out = socket.getOutputStream();
        out.write("已收到,OK".getBytes());
        socket.close();
        server.close();
    }
}
