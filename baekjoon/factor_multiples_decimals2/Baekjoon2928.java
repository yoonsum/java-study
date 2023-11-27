package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon2928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Integer> numList = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            } else {
                numList.add(n);
            }
        }

        for (int k = 0; k < numList.size(); k++) {
            int n = numList.get(k);

            boolean[] isPrime = new boolean[2 * n + 1];
            Arrays.fill(isPrime, true);

            isPrime[0] = isPrime[1] = false;
            for (int i = 2; i * i <= 2 * n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i])
                    cnt++;
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
