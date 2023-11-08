package baekjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num.charAt(i) - '0';
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
