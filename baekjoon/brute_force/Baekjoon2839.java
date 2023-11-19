package baekjoon.brute_force;

import java.io.*;

public class Baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt5 = n / 5;
        int cnt3 = 0;

        while (cnt5 >= 0) {
            if ((n - (5 * cnt5)) % 3 == 0) {
                cnt3 = (n - (5 * cnt5)) / 3;
                bw.write(Integer.toString(cnt5 + cnt3));
                break;
            } else {
                cnt5--;
            }
        }
        if (cnt5 <= 0 && cnt3 <= 0) {
            bw.write(Integer.toString(-1));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
