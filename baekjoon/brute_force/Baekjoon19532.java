package baekjoon.brute_force;

import java.io.*;
import java.util.*;

public class Baekjoon19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a * x + b * y == c) && (d * x + e * y == f)) {
                    bw.write(Integer.toString(x) + " " + Integer.toString(y));
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
