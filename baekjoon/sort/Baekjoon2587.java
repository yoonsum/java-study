package baekjoon.sort;

import java.io.*;

public class Baekjoon2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(br.readLine());
            sum += n[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (n[i] > n[j]) {
                    int tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }
        bw.write(Integer.toString(sum / 5) + "\n" + Integer.toString(n[2]));
        bw.flush();
        bw.close();
        br.close();

    }
}
