package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int j = 0; j < n; j++) {
            for (int i = n - j - 1; i > 0; i--) {
                bw.write(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int j = n - 1; j > 0; j--) {
            for (int i = j; i < n; i++) {
                bw.write(" ");
            }
            for (int i = 0; i < j * 2 - 1; i++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
