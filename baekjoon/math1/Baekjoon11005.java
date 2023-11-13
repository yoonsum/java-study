package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuffer;

public class Baekjoon11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String num_value = "";
        while (true) {
            int num = n % b;
            if (num < 10) {
                num_value += (num);
            } else {
                num_value += (char) (num + 'A' - 10);
            }
            if (n / b == 0) {
                break;
            }
            n = n / b;
        }
        StringBuffer sb = new StringBuffer(num_value);

        bw.write(sb.reverse().toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
