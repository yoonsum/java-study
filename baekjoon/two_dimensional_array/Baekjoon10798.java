package baekjoon.two_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] alpabet = new char[5][];

        int max_x = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();

            int x = s.length();
            alpabet[i] = new char[x];

            if (x > max_x) {
                max_x = x;
            }

            for (int j = 0; j < x; j++) {
                alpabet[i][j] = s.charAt(j);
            }
        }

        for (int j = 0; j < max_x; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < alpabet[i].length) {
                    bw.write(Character.toString(alpabet[i][j]));
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
