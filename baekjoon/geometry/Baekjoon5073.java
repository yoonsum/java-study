package baekjoon.geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            int[] triangle = new int[3];
            st = new StringTokenizer(br.readLine());

            int max_idx = 0;
            for (int i = 0; i < 3; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
                if (triangle[max_idx] < triangle[i]) {
                    max_idx = i;
                }
            }

            int sum = 0;
            for (int i = 0; i < 3; i++) {
                if (i != max_idx) {
                    sum += triangle[i];
                }
            }

            if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) {
                break;
            }

            if (triangle[max_idx] < sum) {
                if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
                    bw.write("Equilateral\n");
                } else if (triangle[0] == triangle[1] || triangle[1] == triangle[2] || triangle[2] == triangle[0]) {
                    bw.write("Isosceles\n");
                } else if (triangle[0] != triangle[1] && triangle[1] != triangle[2] && triangle[2] != triangle[0]) {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
