package cwb.honor.反射;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

/**
 * Created by PC-CWB on 2017/4/18.
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<LinkedList> linkedListClass = LinkedList.class;

//        java.util.LinkedList list=null;
//        Class<? extends LinkedList> aClass1 = list.getClass();

        Class<?> aClass = Class.forName("java.util.LinkedList");

        Package aPackage = aClass.getPackage();
        Optional.ofNullable(aPackage).ifPresent(System.out::println);
        Optional.ofNullable(aPackage.getName()).ifPresent(System.out::println);

        int modifiers = aClass.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        String name = aClass.getName();
        System.out.println(name);

        TypeVariable<? extends Class<?>>[] typeParameters = aClass.getTypeParameters();

        Class<?>[] ii = aClass.getInterfaces();
        if (ii != null && ii.length != 0) {


            }


        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.getName();
        }
        System.out.println(Arrays.toString(declaredFields));

        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();


        Method[] declaredMethods = aClass.getDeclaredMethods();

    }
    }

