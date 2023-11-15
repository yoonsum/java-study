package baekjoon.divisors_and_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        if (m != 1) {
            for (int i = m; i <= n; i++) {
                boolean flag = false;
                for (int j = 2; j * j <= i; j++) {
                    if (j * j == i) {
                        flag = false;
                        break;
                    } else if (i % j == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    if (min == 0) {
                        min = i;
                    }
                    sum += i;
                }
            }
        }

        if (sum == 0) {
            bw.write(Integer.toString(-1));
        } else {
            bw.write(Integer.toString(sum) + "\n");
            bw.write(Integer.toString(min));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
