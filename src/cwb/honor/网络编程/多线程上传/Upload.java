package cwb.honor.网络编程.多线程上传;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class Upload implements Runnable {

    private Socket socket;

    public Upload(Socket socket){
        this.socket = socket;

    }    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();//源
            String fileName = UUID.randomUUID().toString() + ".jpg";
            FileOutputStream fos = new FileOutputStream("F:" + File.separator + "socket" + File.separator + "Upload" + File.separator + fileName);
            byte[] data = new byte[1024 * 5];
            int len = 0;

            while ((len = in.read(data)) != -1) {//服务器端读的是客户端的字节数组，永远不会读到-1，解决办法，在客户端加上终止序列
                fos.write(data, 0, len);
                fos.flush();
            }
            OutputStream out = socket.getOutputStream();
            out.write("上传成功".getBytes());
            fos.close();
            socket.close();
        }catch (IOException e){

        }
    }
}
