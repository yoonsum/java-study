package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int score = Integer.parseInt(str);

        if (90 <= score && score <= 100) {
            bw.write("A");
        } else if (80 <= score && score <= 89) {
            bw.write("B");
        } else if (70 <= score && score <= 79) {
            bw.write("C");
        } else if (60 <= score && score <= 69) {
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.flush();
        bw.close();

        br.close();
    }
}
