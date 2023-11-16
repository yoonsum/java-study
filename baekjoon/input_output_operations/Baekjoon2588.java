package baekjoon.input_output_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2588 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int value1 = Integer.parseInt(br.readLine());
        int value2 = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(value1 * (value2 % 10)) + "\n");
        bw.write(Integer.toString(value1 * (value2 % 100 / 10)) + "\n");
        bw.write(Integer.toString(value1 * (value2 / 100)) + "\n");
        bw.write(Integer.toString(value1 * value2) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
