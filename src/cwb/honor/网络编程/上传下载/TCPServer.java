package cwb.honor.网络编程.上传下载;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7998);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();//源
        String fileName= UUID.randomUUID().toString()+".jpg";
        FileOutputStream fos = new FileOutputStream("F:"+File.separator+"socket"+File.separator+"Upload"+ File.separator+fileName);
        byte[] data = new byte[1024 * 5];
        int len=0;

        while ((len=in.read(data))!=-1){//服务器端读的是客户端的字节数组，永远不会读到-1，解决办法，在客户端加上终止序列
            fos.write(data, 0, len);
            fos.flush();
        }
        OutputStream out = socket.getOutputStream();
        out.write("上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
