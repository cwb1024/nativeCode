package cwb.honor.网络编程.上传下载;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7998);
        //上传一张图片
        OutputStream out = socket.getOutputStream();
        //数据源
        FileInputStream fileInputStream = new FileInputStream("F:\\socket\\download\\cwb.jpg");
        byte[] data = new byte[1024*5];
        int len=0;
        while ((len = fileInputStream.read(data)) != -1){
            out.write(data,0,len);
            out.flush();
        }
        //写一个终止序列，防止服务器端无限等待
        socket.shutdownOutput();
        //获取字节输入流，读取返回信息
        InputStream in = socket.getInputStream();
        len = in.read(data);
        System.out.println(new String(data,0,len));
        fileInputStream.close();
        socket.close();
    }
}
