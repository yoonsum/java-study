package baekjoon.brute_force;

import java.io.*;
import java.util.*;

public class Baekjoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String inputStr = br.readLine();

            for (int j = 0; j < m; j++) {
                board[i][j] = inputStr.charAt(j);
            }
        }

        int min = 64;
        for (int k = 0; k <= n - 8; k++) {
            for (int l = 0; l <= m - 8; l++) {

                int start_B_cnt = 0;
                int start_W_cnt = 0;

                for (int i = k; i < k + 8; i++) {
                    for (int j = l; j < l + 8; j++) {
                        if ((i + j) % 2 == 0) {
                            if ('W' == board[i][j]) {
                                start_B_cnt++;
                            } else {
                                start_W_cnt++;
                            }
                        } else {
                            if ('B' == board[i][j]) {
                                start_B_cnt++;
                            } else {
                                start_W_cnt++;
                            }
                        }
                    }
                }

                if (min > start_B_cnt) {
                    min = start_B_cnt;
                }
                if (min > start_W_cnt) {
                    min = start_W_cnt;
                }
            }

        }

        bw.write(Integer.toString(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
