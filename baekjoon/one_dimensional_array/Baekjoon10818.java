package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for (int i = 1; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        bw.write(Integer.toString(min) + " " + Integer.toString(max));

        bw.flush();
        bw.close();
        br.close();
    }
}
