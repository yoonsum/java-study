package baekjoon.divisors_and_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            ArrayList<Integer> factors = new ArrayList<Integer>();
            int sum = 0;
            for (int i = 1; i * i < n; i++) {
                if (i * i == n) {
                    factors.add(i);
                    sum += i;
                } else if (n % i == 0) {
                    factors.add(i);
                    factors.add(n / i);

                    sum += i;
                    if (n / i != n) {
                        sum += (n / i);
                    }
                }
            }
            Collections.sort(factors);
            int len = factors.size();

            if (sum == factors.get(len - 1)) {
                bw.write(Integer.toString(factors.get(len - 1)) + " = ");
                for (int i = 0; i < len - 1; i++) {
                    bw.write(Integer.toString(factors.get(i)));
                    if (i != len - 2) {
                        bw.write(" + ");
                    }
                }
                bw.write("\n");
            } else {
                bw.write(Integer.toString(n) + " is NOT perfect.\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
