package baekjoon.time_complexity;

import java.io.*;
import java.util.*;

public class Baekjoon24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long fn = a1 * n + a0;
        if (fn <= c * n && a1 <= c) {
            bw.write(Integer.toString(1));
        } else {
            bw.write(Integer.toString(0));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
