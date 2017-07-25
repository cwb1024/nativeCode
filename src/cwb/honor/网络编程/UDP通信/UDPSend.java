package cwb.honor.网络编程.UDP通信;

import java.io.IOException;
import java.net.*;

/**
 * Created by PC-CWB on 2017/4/9.
 * 实现UDP协议的发送端：
 *      需要实现的类：
 *          (打包)数据封装的类：java.net.DatagramPacket
 *          (发出数据包)数据发送的类：java.net.DatagramSocket
 *
 * 实现步骤：
 *      1、创建DatagramPacket对象，封装数据，接收端的  ip , port
 *      2、创建DatagramSocket对象，
 *      3、调用DatagramSocket对象的send，发送数据包
 *      4、关闭资源，DatagramSocket
 */

public class UDPSend {
    public static void main(String[] args) throws IOException {

        byte[] bytes = "UDP UDP UDP".getBytes();

        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket packet=new DatagramPacket(bytes,bytes.length,ip,6000);

        DatagramSocket socket = new DatagramSocket();

        socket.send(packet);

        socket.close();

    }
}
