package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Baekjoon18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int[] sorted_arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sorted_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted_arr);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(sorted_arr[i])) {
                hm.put(sorted_arr[i], idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(hm.get(arr[i])).append(' ');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
