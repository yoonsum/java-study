package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chess_piece = { 1, 1, 2, 2, 2, 8 };

        for (int i = 0; i < chess_piece.length; i++) {
            bw.write(Integer.toString(chess_piece[i] - Integer.parseInt(st.nextToken())) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
