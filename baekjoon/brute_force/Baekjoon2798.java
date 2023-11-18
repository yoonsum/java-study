package baekjoon.brute_force;

import java.io.*;
import java.util.*;

public class Baekjoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] card = new long[n];
        long max_sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long sum = card[i] + card[j] + card[k];

                    if (sum <= m && m - sum < m - max_sum) {
                        max_sum = sum;
                    }
                }
            }
        }

        bw.write(max_sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}