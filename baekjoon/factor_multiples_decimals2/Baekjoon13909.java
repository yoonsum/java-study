package baekjoon.factor_multiples_decimals2;

import java.io.*;

public class Baekjoon13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            cnt++;
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
