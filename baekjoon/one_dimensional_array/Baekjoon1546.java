package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] sub = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            sub[i] = Integer.parseInt(st.nextToken());

            if (max < sub[i]) {
                max = sub[i];
            }
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += ((sub[i] + 0.0) / max * 100);
        }
        bw.write(Double.toString(sum / n));
        bw.flush();
        bw.close();
        br.close();
    }
}
