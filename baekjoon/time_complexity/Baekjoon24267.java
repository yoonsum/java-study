package baekjoon.time_complexity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        // 공식 = (n-2)n-1n/6
        bw.write(Long.toString((n - 2) * (n - 1) * n / 6) + "\n");
        bw.write(Integer.toString(3));
        bw.flush();
        bw.close();
        br.close();
    }
}
