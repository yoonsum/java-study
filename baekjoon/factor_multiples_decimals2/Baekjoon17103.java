package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[] num = new int[t];
        int max = 0;
        for (int i = 0; i < t; i++) {
            num[i] = Integer.parseInt(br.readLine());
            if (max < num[i]) {
                max = num[i];
            }
        }

        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int cnt = 0;
            for (int j = 2; j <= num[i] / 2; j++) {
                if (isPrime[j]) {
                    int n = num[i] - j;
                    if (isPrime[n]) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
