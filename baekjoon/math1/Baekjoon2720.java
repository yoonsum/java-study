package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] money = { 25, 10, 5, 1 };
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());

            for (int j = 0; j < 3; j++) {
                bw.write(Integer.toString(change / money[j]) + " ");
                change = change % money[j];
            }
            bw.write(Integer.toString(change) + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
