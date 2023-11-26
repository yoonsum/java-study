package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon1735 {
    public static int getGCD(int a, int b) {
        int tmp1 = a;
        int tmp2 = b;

        while (tmp2 != 0) {
            int r = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = r;
        }

        return tmp1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int result_a;
        int result_b;
        int lcm;

        if (b1 == b2) {
            result_a = a1 + a2;
            result_b = b1;
        } else {
            if (b1 > b2) {
                lcm = (b1 * b2) / getGCD(b1, b2);
                result_a = a1 * (lcm / b1) + a2 * (lcm / b2);
                result_b = lcm;
            } else {
                lcm = (b1 * b2) / getGCD(b2, b1);
                result_a = a1 * (lcm / b1) + a2 * (lcm / b2);
                result_b = lcm;
            }
        }

        StringBuilder sb = new StringBuilder();
        int gcd = getGCD(result_a, result_b);
        if (gcd == 1) {
            sb.append(result_a).append(" ").append(result_b);
        } else {
            sb.append(result_a / gcd).append(" ").append(result_b / gcd);
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        br.close();

    }
}
