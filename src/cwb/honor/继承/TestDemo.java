package cwb.honor.继承;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by PC-CWB on 2017/4/4.
 */
public class TestDemo {
    @Test
    public void TestT() {
        JavaEE ee = new JavaEE("张三", 10);
        ee.work();

        Net net = new Net("李四", 20);
        net.work();

        System.out.println("=========================");

        Employee employee = null;
        employee = new JavaEE("张三", 10);
        employee.work();

        employee = new Net("李四", 20);
        employee.work();

    }

    @Test
    public void TestD(){
        int arr[]=new int[5];
        int i=3;
        if (i > 3 && arr[6] == 0) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int number = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while (true) {
            userNumber = scanner.nextInt();
            if (userNumber > number) {
                System.out.println("大了");
            } else if (userNumber < number) {
                System.out.println("小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }

    }

