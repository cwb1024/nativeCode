package cwb.honor.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by PC-CWB on 2017/4/9.
 * 表示互联网中的IP地址
 * java.InetAddress
 *      静态方法
 *
 *          (拿自己的)static InetAddress getLocalhost();
 *
 *          (拿别人的)static InetAddress getByName(String hostName);传递一个主机名，获取该主机的ip地址对象
 *      非静态方法
 *      String getHostAddress()获取主机ip地址
 *      String getHostName() 获取主机名
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        /*InetAddress address = function_1();
        function_2();*/
        //上两个方法是用来获取自己的ip地址
        function_3();

    }

    //网络通信，获取别人的ip地址
    private static void function_3() throws UnknownHostException {
        InetAddress address=InetAddress.getByName("Lenovo-PC");//通过主机名，获取ip地址，那么主机名如果重名了怎么办(传ip也行这里)
        System.out.println(address);
    }

    //通过静态方法拿到，在通过非静态方法分别拿到ip，和主机名
    private static void function_2() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName+","+hostAddress);
    }

    //静态拿到本机的地址，在通过切割字符串的方式拿到 ip 主机名
    private static InetAddress function_1() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        //通过切割字符串的方式分别拿到ip,主机名
        String ip = address.toString();
        String[] split = ip.split("/");
        System.out.println(Arrays.toString(split));
        System.out.println(address);
        return address;
    }
}
