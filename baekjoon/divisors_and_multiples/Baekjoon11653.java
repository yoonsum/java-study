package baekjoon.divisors_and_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int num = n;
        for (int i = 2; i <= n; i++) {
            while (num % i == 0) {
                num /= i;
                bw.write(Integer.toString(i) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
