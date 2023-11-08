package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer[] st = new StringTokenizer[testCase];

        for (int i = 0; i < testCase; i++) {
            st[i] = new StringTokenizer(br.readLine());
        }

        for (int i = 0; i < testCase; i++) {
            int A = Integer.parseInt(st[i].nextToken());
            int B = Integer.parseInt(st[i].nextToken());
            bw.write(Integer.toString(A + B) + "\n");
        }

        bw.flush();
        bw.close();

        br.close();

    }
}
