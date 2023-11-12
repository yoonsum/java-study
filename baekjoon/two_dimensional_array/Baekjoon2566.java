package baekjoon.two_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = board[0][0];
        int max_x = 0;
        int max_y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] > max) {
                    max = board[i][j];
                    max_x = i;
                    max_y = j;
                }
            }
        }

        bw.write(Integer.toString(max) + "\n");
        bw.write(Integer.toString(max_x + 1) + " " + Integer.toString(max_y + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
