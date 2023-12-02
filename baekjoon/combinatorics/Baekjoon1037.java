package baekjoon.combinatorics;

import java.io.*;
import java.util.*;

public class Baekjoon1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        int result = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if (n % 2 == 1) {
            int numIdx = n / 2;

            result = arr[numIdx] * arr[numIdx];
        } else {
            result = arr[0] * arr[n - 1];
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
