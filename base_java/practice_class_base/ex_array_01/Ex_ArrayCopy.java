package base_java.practice_class_base.ex_array_01;

import java.util.Arrays;

public class Ex_ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[8];

        // arr1을 3으로 초기화
        Arrays.fill(arr1, 3);

        // arr1에서 arr2의 index = 3으로 length=4 만큼 복사
        System.arraycopy(arr1, 0, arr2, 3, 3);

        for (int a1 : arr1) {
            System.out.print(a1 + " ");
        }
        System.out.println();

        for (int a2 : arr2) {
            System.out.print(a2 + " ");
        }
        System.out.println();

        // arr2를 arr3으로 index=2 부터 index=5까지 복사
        int[] arr3 = Arrays.copyOfRange(arr2, 2, 7);
        for (int a3 : arr3) {
            System.out.print(a3 + " ");
        }
        System.out.println();

        // arr3을 arr4로 처음부터 length=4만큼 복사
        int[] arr4 = Arrays.copyOf(arr3, 3);
        for (int a4 : arr4) {
            System.out.print(a4 + " ");
        }
        System.out.println();

    }
}
