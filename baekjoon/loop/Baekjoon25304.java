package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        StringTokenizer[] st = new StringTokenizer[n];

        for (int i = 0; i < n; i++) {
            st[i] = new StringTokenizer(br.readLine());
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int price = Integer.parseInt(st[i].nextToken());
            int cnt = Integer.parseInt(st[i].nextToken());

            sum += (price * cnt);
        }

        if (x == sum) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
