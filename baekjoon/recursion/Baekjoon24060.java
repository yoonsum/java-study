package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class Baekjoon24060 {
    static int[] arr;
    static int[] tmp;
    static int cnt = 0;
    static int k;
    static int num = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[n];
        tmp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(0, n - 1);

        bw.write(Integer.toString(num));

        bw.flush();
        bw.close();
        br.close();
    }

    public static void merge_sort(int start, int end) {
        if (cnt > k)
            return;
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(start, mid);
            merge_sort(mid + 1, end);
            merge(start, end, mid);
        }
    }

    public static void merge(int s, int e, int m) {
        int i = s;
        int j = m + 1;
        int t = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                tmp[t] = arr[i++];
            } else {
                tmp[t] = arr[j++];
            }
            t++;
        }

        while (i <= m) {
            tmp[t++] = arr[i++];
        }

        while (j <= e) {
            tmp[t++] = arr[j++];
        }

        i = s;
        t = 0;
        while (i <= e) {
            cnt++;
            if (cnt == k) {
                num = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}
