package cwb.honor.网络编程.UDP通信.子包;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class Receive {
    public static void main(String[] args)throws IOException {

        DatagramSocket socket = new DatagramSocket(7999);
        byte[] data = new byte[1024];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);

            //拆包，都是对包对象的操作
            //这个传过来的数据谁管着呢
            int len = packet.getLength();
            String address = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println(new String(data, 0, len) + "..." + address + ":" + port);
        }
//        socket.close();
    }
}
