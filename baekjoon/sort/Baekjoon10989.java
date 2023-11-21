package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Baekjoon10989 {
    // public static void swap(int[] a, int i, int j) {
    // int tmp = a[i];
    // a[i] = a[j];
    // a[j] = tmp;
    // }

    // public static void quick_sort(int[] a, int start, int end) {
    // int pivot = start;
    // int s = start + 1;
    // int e = end;

    // while (s < e) {
    // while (s <= end && a[s] <= a[pivot]) {
    // s++;
    // }
    // while (e > start && a[e] >= a[pivot]) {
    // e--;
    // }

    // if (s > e) {
    // swap(a, e, pivot);
    // } else {
    // swap(a, s, e);
    // }
    // }
    // if (start < e - 1) {
    // quick_sort(a, start, e - 1);
    // }
    // if (e + 1 < end) {
    // quick_sort(a, e + 1, end);
    // }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);
        // quick_sort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(a[i]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
