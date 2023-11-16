package baekjoon.input_output_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon11382 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0L;
        int len = st.countTokens();
        for (int i = 0; i < len; i++) {
            sum += Long.parseLong(st.nextToken());
        }

        bw.write(Long.toString(sum));

        bw.flush();
        bw.close();
        br.close();
    }

}
