package base_java.practice_class_base.ex_array_01;

import java.util.Arrays;

public class Ex_ArrayEquals {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        // 배열 길이가 같고 내용이 같으면 true
        boolean bCheck = Arrays.equals(arr1, arr2);
        System.out.println(bCheck);
    }
}
