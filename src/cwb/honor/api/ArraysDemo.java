package cwb.honor.api;

import java.util.Arrays;

/**
 * Created by PC-CWB on 2017/4/2.
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 11, 22};
//        function_1(arr);
        function_2(arr, 10);
        function_3(arr);
    }

    //看数组元素，可以不用遍历，直接用Arrays.toString(数组)
    private static void function_3(int[] arr) {
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

    //元素不存在，返回的是，( -插入点-1)
    private static void function_2(int arr[], int target) {
        int i = Arrays.binarySearch(arr, target);
        System.out.println(i);
    }

    private static void function_1(int [] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
