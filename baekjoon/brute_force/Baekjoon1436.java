package baekjoon.brute_force;

import java.io.*;

public class Baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        long i = 666;
        int num = 0;
        while (true) {
            String tmp = Long.toString(i);

            int cnt = 0;
            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.indexOf("666") >= 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                num++;
            }
            if (num == n) {
                bw.write(Long.toString(i));
                break;
            }
            i++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
