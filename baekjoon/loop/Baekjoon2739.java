package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dan = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            bw.write(Integer.toString(dan) + " * " + Integer.toString(i) + " = " + Integer.toString(dan * i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
