package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            H = H - 1;
            if (H < 0) {
                H = 24 + H;
            }
            M = 60 + M - 45;
        } else {
            M = M - 45;
        }

        bw.write(Integer.toString(H) + " " + Integer.toString(M));

        bw.flush();
        bw.close();

        br.close();
    }
}
