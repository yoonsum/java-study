package baekjoon.divisors_and_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > 1) {
                if (num == 2 || num == 3) {
                    cnt++;
                } else {
                    boolean flag = false;
                    for (int j = 2; j < num; j++) {
                        if (num % j == 0) {
                            flag = false;
                            break;
                        } else {
                            flag = true;
                        }
                    }
                    if (flag) {
                        cnt++;
                    }
                }
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
