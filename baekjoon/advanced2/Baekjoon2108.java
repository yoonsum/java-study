package baekjoon.advanced2;

import java.io.*;
import java.util.*;

public class Baekjoon2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int max = 1;
        int cnt = 1;
        Set<Integer> s = new TreeSet<>();
        s.add(arr[0]);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (max < cnt) {
                max = cnt;
                s.clear();
                s.add(arr[i]);
            }
            if (max == cnt) {
                s.add(arr[i]);
            }
        }

        int f;
        Iterator<Integer> itr = s.iterator();
        if (s.size() > 1) {
            itr.next();
            f = itr.next();
        } else {
            f = itr.next();
        }

        StringBuilder sb = new StringBuilder();

        sb.append(Math.round(sum / n)).append("\n");
        sb.append(arr[n / 2]).append("\n");
        sb.append(f).append("\n");
        sb.append(arr[n - 1] - arr[0]).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
