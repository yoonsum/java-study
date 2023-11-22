package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Baekjoon11650 {
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a1, a2) -> {
            return a1[0] != a2[0] ? a1[0] - a2[0] : a1[1] - a2[1];
        });

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(arr[i][0]) + " " + Integer.toString(arr[i][1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
