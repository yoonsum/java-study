package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int num = 1;
        int cnt = 1;
        while (true) {
            int sum = 0;
            int child = 0;
            int parent = 0;
            if (num < n) {
                cnt++;
                num = num + cnt;
            } else {
                sum = cnt + 1;
                if (cnt % 2 == 0) {
                    parent = num - n + 1;
                    child = sum - parent;
                } else {
                    child = num - n + 1;
                    parent = sum - child;
                }
                bw.write(Integer.toString(child) + "/" + Integer.toString(parent));
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
