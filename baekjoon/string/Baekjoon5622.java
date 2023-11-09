package baekjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dial_time = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

        String str = br.readLine();

        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            time += dial_time[str.charAt(i) - 'A'];
        }
        bw.write(Integer.toString(time));

        bw.flush();
        bw.close();
        br.close();
    }
}
