package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer[] st = new StringTokenizer[T];

        for (int i = 0; i < T; i++) {
            st[i] = new StringTokenizer(br.readLine());

        }

        for (int i = 0; i < T; i++) {
            int A = Integer.parseInt(st[i].nextToken());
            int B = Integer.parseInt(st[i].nextToken());

            bw.write("Case #" + (i + 1) + ": " + Integer.toString(A + B) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
