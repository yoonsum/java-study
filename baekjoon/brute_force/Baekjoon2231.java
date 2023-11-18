package baekjoon.brute_force;

import java.io.*;

public class Baekjoon2231 {
    public static int valueCheck(String n) {
        int len = n.length();
        long num = Long.parseLong(n);

        int value = 0;
        for (int i = 0; i < len - 1; i++) {
            value += (9 * Math.pow(10, len - 2 - i) + 9);
        }

        if (value < num) {
            return len;
        } else {
            return len - 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n_str = br.readLine();
        long n = Long.parseLong(n_str);
        int new_len = valueCheck(n_str);
        String result = "0";

        for (long i = (long) Math.pow(10, new_len - 1); i < n; i++) {
            long sum = 0;
            long number = i;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum + i == n) {
                result = Long.toString(i);
                break;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
