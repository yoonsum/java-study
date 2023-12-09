package baekjoon.recursion;

import java.io.*;
import java.util.Arrays;

public class Baekjoon2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '*');
        }

        int count = n / 3;

        while (count >= 1) {
            for (int start_x = count; start_x < n; start_x += (count * 3)) {
                for (int start_y = count; start_y < n; start_y += (count * 3)) {

                    for (int i = start_x; i < start_x + count; i++) {
                        for (int j = start_y; j < start_y + count; j++) {
                            board[i][j] = ' ';
                        }
                    }
                }
            }

            count /= 3;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
