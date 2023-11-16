package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        long num = 0L;

        for (int i = 0; i < n.length(); i++) {
            if ('A' <= n.charAt(i) && n.charAt(i) <= 'Z') {
                num += ((n.charAt(i) - 'A' + 10) * Math.pow(b, n.length() - i - 1));
            } else {
                num += ((n.charAt(i) - '0') * Math.pow(b, n.length() - i - 1));
            }
        }

        bw.write(Long.toString(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
