package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 1) {
                sb.append(b).append("\n");
            } else if (b == 1) {
                sb.append(a).append("\n");
            } else if (a == b) {
                sb.append(a).append("\n");
            } else {
                int n = 1;
                if (a > b) {
                    while (true) {
                        if ((b * n) % a == 0) {
                            sb.append(Integer.toString(b * n)).append("\n");
                            break;
                        }
                        n++;
                    }
                } else {
                    while (true) {
                        if ((a * n) % b == 0) {
                            sb.append(Integer.toString(a * n)).append("\n");
                            break;
                        }
                        n++;
                    }
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
