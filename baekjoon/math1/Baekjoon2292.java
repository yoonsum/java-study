package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int num = 1;
        int cnt = 1;
        while (true) {
            if (n > num) {
                num += (6 * cnt);
                cnt++;
            } else {
                bw.write(Integer.toString(cnt));
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
