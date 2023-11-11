package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] alpabetNum = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                alpabetNum[c - 'A']++;
            } else {
                alpabetNum[c - 'a']++;
            }
        }

        int max = 0;
        char c = 'A';
        for (int i = 1; i < 26; i++) {
            if (alpabetNum[max] < alpabetNum[i]) {
                max = i;
                c = (char) ('A' + i);
            } else if (alpabetNum[max] == alpabetNum[i]) {
                max = i;
                c = '?';
            }
        }
        bw.write(Character.toString(c));
        bw.flush();
        bw.close();
        br.close();
    }
}