package cwb.honor.网络编程.TCP通信;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by PC-CWB on 2017/4/9.
 */
public class TCPServerObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(6999);
        Socket socket = server.accept();

        InputStream ins = socket.getInputStream();

        ObjectInputStream objectInputStream = new ObjectInputStream(ins);

        Person person = (Person) objectInputStream.readObject();

        System.out.println(person.getAge() + "," + person.getName());

    }
}
