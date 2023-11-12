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
        int num = 0;

        for (int i = 0; i < n.length(); i++) {
            if ((n.charAt(i) - 'A') > 0) {
                num += ((int) (n.charAt(i) - 'A' + 10) * Math.pow(b, n.length() - i - 1));
            } else {
                num += ((int) n.charAt(i) * Math.pow(b, n.length() - i - 1));
            }
        }

        bw.write(Integer.toString(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
