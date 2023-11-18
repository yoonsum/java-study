package baekjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if (num1 > num2) {
            bw.write(Integer.toString(num1));
        } else {
            bw.write(Integer.toString(num2));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
