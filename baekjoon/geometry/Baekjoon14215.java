package baekjoon.geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;
        int sum = 0;
        if (max < a) {
            max = a;
            sum = b + c;
        }
        if (max < b) {
            max = b;
            sum = a + c;
        }
        if (max < c) {
            max = c;
            sum = a + b;
        }

        if (max < sum) {
            bw.write(Integer.toString(a + b + c));
        } else {
            bw.write(Integer.toString(sum * 2 - 1));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
