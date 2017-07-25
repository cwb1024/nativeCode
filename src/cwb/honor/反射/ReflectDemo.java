package cwb.honor.反射;

import java.lang.reflect.Field;

/**
 * 反射构造方法并执行，快捷方法
 * 前提条件，必须由public修饰，必须有空参数构造方法,如果没有重载构造方法，那么即使不写，也会有一个默认的构造方法
 * 构造器中的newInstance可以传参数，而这种简洁方法不能传参数
 * @author PC-CWB
 *
 */
public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("cwb.honor.反射.Person");
		Object obj=c.newInstance();
//		System.out.println(obj);
		/*Annotation[] declaredAnnotations = c.getDeclaredAnnotations();
		for (Annotation annotation : declaredAnnotations) {
			System.out.println(annotation);
		}*/
		
		//通过反射获取所有的构造方法
		/*Constructor[] declaredConstructors = c.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}*/
		
		//通过反射，获取公共的构造方法
		/*Constructor[] constructors = c.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}*/
		
		//暴力反射，拿到指定参数列表的私有构造方法
		/*Constructor con = c.getDeclaredConstructor(String.class);
		System.out.println(con);*/
		
		//通过反射，拿到指定参数列表的公共的构造方法
		/*Constructor constructor = c.getConstructor(String.class,int.class,String.class);
		System.out.println(constructor);
		Object obj=constructor.newInstance("zhangsan",10,"1234@qq.com");
		System.out.println(obj);*/
		
		//通过反射获取成员变量并修改值
		/*Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}*/
		
		//获取指定的成员变量
		Field declaredField = c.getDeclaredField("age");
		declaredField.setAccessible(true);//这句话使得私有的属性变得可以通过反射来访问（不加会运行报错，编译不报错，运行时异常）
		declaredField.set(obj, 11);
		System.out.println(obj);
		//获取类中的公共方法
		/*Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/
		
		//获取类中全部的方法
		/*Method[] declaredMethods = c.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}*/
		
		//获取指定参数的方法
		/*Method method = c.getMethod("eat", String.class);
		System.out.println(method);*/
		
		//获取指定无参的方法
		/*Method method = c.getMethod("eat", null);
		System.out.println(method);*/
		
		//私有权限指定方法
		/*Method declaredMethod = c.getDeclaredMethod("walk");
		System.out.println(declaredMethod);*/
		
		//私有权限指定带参数的方法
		/*Method declaredMethod = c.getDeclaredMethod("walk", String.class);
		System.out.println(declaredMethod);*/
		
		//保护权限指定方法(暴力反射)
		/*Method method = c.getDeclaredMethod("sing", null);
		System.out.println(method);*/
		
		//默认权限无参方法(暴力反射)
		/*Method method = c.getDeclaredMethod("laugh");
		System.out.println(method);*/
		
		//默认权限参数列表(暴力反射)
		/*Method declaredMethod = c.getDeclaredMethod("laugh", String.class);
		System.out.println(declaredMethod);*/
		
		//执行一个方法
		/*Method method = c.getMethod("eat", String.class);
		method.invoke(obj, "张三");*/
		
		//执行一个私有的方法(报异常，不让执行private的方法)
		/*Method declaredMethod = c.getDeclaredMethod("walk", String.class);
		declaredMethod.setAccessible(true);//加上可以执行私有方法，值为true,则指示反射的对象在使用时应该取消Java语法访问检查
		declaredMethod.invoke(obj,"李四");*/
		
		//执行默认的方法
		/*Method declaredMethod = c.getDeclaredMethod("laugh", String.class);
		declaredMethod.invoke(obj, "王五");*/

		//执行受保护的方法
		/*Method declaredMethod = c.getDeclaredMethod("sing", String.class);
		declaredMethod.invoke(obj, "赵六");*/

	}
	
}
