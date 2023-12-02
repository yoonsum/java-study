package baekjoon.combinatorics;

import java.io.*;
import java.util.*;

public class Baekjoon11050 {
    public static int factorial(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = factorial(n) / factorial(n - k) / factorial(k);

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
