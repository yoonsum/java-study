package baekjoon.two_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] board = new boolean[100][100];
        int num = Integer.parseInt(br.readLine());
        int area = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int x_i = x; x_i < x + 10; x_i++) {
                for (int y_i = y; y_i < y + 10; y_i++) {
                    if (board[x_i][y_i] == false) {
                        board[x_i][y_i] = true;
                        area++;
                    }
                }
            }
        }

        bw.write(Integer.toString(area));
        bw.flush();
        bw.close();
        br.close();

    }
}
