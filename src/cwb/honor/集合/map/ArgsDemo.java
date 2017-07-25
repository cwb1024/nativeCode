package cwb.honor.集合.map;

/**
 * 可变参数本质上是一个可变参数
 * 注意事项:一个方法中，可变参数只能有一个，可以有固定参数，把可变参数放到末尾
 * @author PC-CWB
 *
 */
public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = getSum(1,2,3,4);
		System.out.println(sum);
		function_1(1,"2",3);
	}

	private static void function_1(int a,String b,int...c) {
		System.out.println(a+","+b+","+c);
	}

	private static int getSum(int...a) {
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}

}
