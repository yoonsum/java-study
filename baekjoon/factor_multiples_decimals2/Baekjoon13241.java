package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        if (b % a == 0) {
            bw.write(Long.toString(b));
        } else if (a % b == 0) {
            bw.write(Long.toString(a));
        } else if (a == b) {
            bw.write(Long.toString(a));
        } else if (a > b) {
            // int n = 1;
            // while ((b * n) % a > 0) {
            // n++;
            // }
            // bw.write(Long.toString(b * n));

            // 유클리드 호제법
            // if(a>b), r=a%b, gcd(a,b) = gcd(b,r);
            // a와 b의 최소공배수 = (a*b) / gcd(a,b)
            long a_num = a;
            long b_num = b;
            while (b_num != 0) {
                long r = a_num % b_num;
                a_num = b_num;
                b_num = r;
            }
            bw.write(Long.toString((a * b) / a_num));
        } else {
            // int n = 1;
            // while ((a * n) % b > 0) {
            // n++;
            // }
            // bw.write(Long.toString(a * n));

            long b_num = b;
            long a_num = a;
            while (a_num != 0) {
                long r = b_num % a_num;
                b_num = a_num;
                a_num = r;
            }
            bw.write(Long.toString((a * b) / b_num));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
