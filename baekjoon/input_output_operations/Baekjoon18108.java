package baekjoon.input_output_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon18108 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int bulgi_year = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(bulgi_year - 543));

        bw.flush();
        bw.close();
        br.close();
    }
}
