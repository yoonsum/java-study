package baekjoon.input_output_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10869 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(A + B) + "\n");
        bw.write(Integer.toString(A - B) + "\n");
        bw.write(Integer.toString(A * B) + "\n");
        bw.write(Integer.toString(A / B) + "\n");
        bw.write(Integer.toString(A % B) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
