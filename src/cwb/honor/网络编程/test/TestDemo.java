package cwb.honor.网络编程.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by PC-CWB on 2017/5/11.
 */
public class TestDemo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostAddress());
        System.out.println(address.getAddress());
    }
}
