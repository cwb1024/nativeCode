package cwb.honor.网络编程.UDP通信.子包;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class Send {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        while(true) {
            String msg = scanner.nextLine();
            byte[] data = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7999);
            socket.send(packet);
        }
//        socket.close();
    }
}
