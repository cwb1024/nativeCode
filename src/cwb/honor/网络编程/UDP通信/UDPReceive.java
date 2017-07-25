package cwb.honor.网络编程.UDP通信;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by PC-CWB on 2017/4/9.
 * 实现UDP协议的发送端：
 *      需要实现的类：
 *          (数据接收)数据封装的类：java.net.DatagramPacket
 *          (接受数据包)数据发送的类：java.net.DatagramSocket
 *
 * 实现步骤：
 *      1、创建DatagramSocket对象，绑定一个端口号(必须要做，需要打开那个端口，就收数据，和发送端的一样)
 *      2、创建一个字节数组，接受发来的数据。
 *      3、创建DatagramPacket对象，封装数据(数组，长度)
 *      4、调用DatagramSocket对象的receive，接受数据包
 *      5、拆包
 *        （发送的IP地址，接受到的字节个数，发送端的端口号）
 *      6、关闭资源
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(6000);

        byte[] data = new byte[1024];

        DatagramPacket packet = new DatagramPacket(data, data.length);

        socket.receive(packet);//具有线程等待效果

        int len = packet.getLength();//获取接受到的字节个数

        //获取发送端的ip地址
        String ip = packet.getAddress().getHostAddress();

        //获取发送的端口号
        int port = packet.getPort();

        System.out.println(new String(data,0,len)+"........"+ip+":"+port);

        socket.close();
    }
}
