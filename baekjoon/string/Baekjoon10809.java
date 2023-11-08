package baekjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baekjoon10809 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] S = br.readLine().toCharArray();
        int[] alpabet = new int[26];
        Arrays.fill(alpabet, -1);

        for (int i = 0; i < S.length; i++) {
            if (alpabet[S[i] - 'a'] == -1) {
                alpabet[S[i] - 'a'] = i;
            }
        }
        for (int a : alpabet) {
            bw.write(Integer.toString(a) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
