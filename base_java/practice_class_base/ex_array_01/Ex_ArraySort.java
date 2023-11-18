package base_java.practice_class_base.ex_array_01;

import java.util.Arrays;

public class Ex_ArraySort {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 2, 4, 3 };
        double[] arr2 = { 1.2, 3.5, 1.1, 4.5, 2.3 };
        String[] arr3 = { "홍길동", "전우치", "손오공", "멀린" };

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        for (int a1 : arr1) {
            System.out.println(a1 + " ");
        }
        System.out.println();

        for (double a2 : arr2) {
            System.out.println(a2 + " ");
        }
        System.out.println();

        for (String a3 : arr3) {
            System.out.println(a3 + " ");
        }
        System.out.println();
    }
}
