package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());

        if (dice1 == dice2 && dice2 == dice3) {
            bw.write(Integer.toString(10000 + dice1 * 1000));
        } else if (dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
            int max = 0;
            if (dice1 > dice2) {
                if (dice1 > dice3) {
                    max = dice1;
                } else {
                    max = dice3;
                }
            } else {
                if (dice2 > dice3) {
                    max = dice2;
                } else {
                    max = dice3;
                }
            }
            bw.write(Integer.toString(max * 100));
        } else {
            int score = 0;
            if ((dice1 == dice2 && dice2 != dice3) || (dice1 == dice3 && dice3 != dice2)) {
                score = dice1;
            } else if (dice2 == dice3 && dice3 != dice1) {
                score = dice2;
            }
            bw.write(Integer.toString(1000 + score * 100));
        }

        bw.flush();
        bw.close();

        br.close();
    }
}
