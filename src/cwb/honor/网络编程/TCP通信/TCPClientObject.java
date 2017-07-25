package cwb.honor.网络编程.TCP通信;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 *
 */
public class TCPClientObject {
    public static void main(String[] args) throws IOException {

        Person person = new Person();
        person.setAge(10);
        person.setName("张三");
        Socket socket = new Socket("127.0.0.1",6999);//建立连接，同时生成IO流对象

        OutputStream outputStream = socket.getOutputStream();//直接通过get拿到流对象

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(person);


    }
}
