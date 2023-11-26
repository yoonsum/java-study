package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            BigInteger bigN = BigInteger.valueOf(n);

            if (bigN.isProbablePrime(10)) {
                sb.append(bigN).append("\n");
            } else {
                sb.append(bigN.nextProbablePrime()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
