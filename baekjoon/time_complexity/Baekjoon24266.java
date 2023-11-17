package baekjoon.time_complexity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        bw.write(Long.toString(n * n * n) + "\n");
        bw.write(Integer.toString(3));
        bw.flush();
        bw.close();
        br.close();
    }
}
