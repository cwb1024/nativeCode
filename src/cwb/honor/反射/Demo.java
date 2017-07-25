package cwb.honor.反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by PC-CWB on 2017/4/13.
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> name = Class.forName("java.util.LinkedList");

        //怎么通过名字拿到class类型
        System.out.println(name);
        LinkedList linkedList = (LinkedList) name.newInstance();

      /*  //去拿到该类的所有属性
        Field[] declaredFields = name.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
*/
        //实现的接口，遍历出来
      /*  AnnotatedType[] annotatedInterfaces = name.getAnnotatedInterfaces();
        for (AnnotatedType type:annotatedInterfaces) {
            System.out.println(type.getType());
        }
        Arrays.toString(annotatedInterfaces);//接口也不是对象

        //继承的父类，因为类只支持单继承，所以只有一个父类
        AnnotatedType annotatedSuperclass = name.getAnnotatedSuperclass();
        System.out.println(annotatedSuperclass.getType());*/

        //构造方法
        Constructor<?> constructor = name.getConstructor();
        System.out.println(constructor);
        Constructor<?>[] constructors = name.getConstructors();
        for (Constructor constructor1:constructors) {
            System.out.println(constructor1);
        }
        Arrays.toString(constructors);


        //有没有注解
        Annotation[] declaredAnnotations = name.getDeclaredAnnotations();
        for (Annotation annotation:declaredAnnotations
             ) {
            System.out.println(annotation);
        }
        Arrays.toString(declaredAnnotations);//注解不是对象

        //全部的方法
        Method[] declaredMethods = name.getDeclaredMethods();

        for (Method method:declaredMethods
             ) {
            System.out.println(method);
        }

        //
        Class<?> enclosingClass = name.getEnclosingClass();
        System.out.println(enclosingClass);

        //通用的接口
        Type[] genericInterfaces = name.getGenericInterfaces();
        for (Type type : genericInterfaces
                ) {
            System.out.println(type.getTypeName());
        }

        AnnotatedType[] annotatedInterfaces = name.getAnnotatedInterfaces();
        for (AnnotatedType type:annotatedInterfaces
             ) {
            System.out.println(type.getType());
        }

        Package aPackage = name.getPackage();
        System.out.println(aPackage);

        ProtectionDomain protectionDomain = name.getProtectionDomain();
        System.out.println(protectionDomain);

        String simpleName = name.getSimpleName();
        System.out.println(simpleName);

        String typeName = name.getTypeName();
        System.out.println(typeName);

        //类型参数
        TypeVariable<? extends Class<?>>[] typeParameters = name.getTypeParameters();
        for (TypeVariable typeVariable:typeParameters
             ) {
            System.out.println(typeVariable);
        }

        boolean b = name.desiredAssertionStatus();
        System.out.println(b);

        //构件类型
        Class<?> componentType = name.getComponentType();
        System.out.println(componentType);

        String simpleName1 = name.getSimpleName();
        System.out.println(simpleName1);

        boolean annotation = name.isAnnotation();
        System.out.println(annotation);


        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //正常输出没问题
        for (Object i:linkedList) {
            System.out.println(i);
        }

        //集合转数组，Arrays工具类为啥输不出来？
        Object[] objects = linkedList.toArray();
        Arrays.toString(objects);


        Method contains = name.getMethod("contains", Object.class);
        System.out.println(contains);
        Object invoke = contains.invoke(linkedList, 2);
        System.out.println(invoke);


    }
}
