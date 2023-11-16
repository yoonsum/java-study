package baekjoon.geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int x_min = x[0];
        int x_max = x[0];
        int y_min = y[0];
        int y_max = y[0];
        int x_sum = x[0];
        int y_sum = y[0];
        for (int i = 1; i < 3; i++) {
            x_sum += x[i];
            y_sum += y[i];
            if (x_min > x[i]) {
                x_min = x[i];
            }
            if (x_max < x[i]) {
                x_max = x[i];
            }
            if (y_min > y[i]) {
                y_min = y[i];
            }
            if (y_max < y[i]) {
                y_max = y[i];
            }
        }

        bw.write(Integer.toString((x_min + x_max) * 2 - x_sum) + " " + Integer.toString((y_min + y_max) * 2 - y_sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
