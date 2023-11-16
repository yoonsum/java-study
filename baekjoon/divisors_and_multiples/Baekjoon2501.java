package baekjoon.divisors_and_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> factor = new ArrayList<Integer>();

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n)
                factor.add(i);
            else if (n % (i) == 0) {
                factor.add(i);
                factor.add(n / i);
            }
        }

        // double i_sqrt = Math.sqrt(n);
        // for (int i = 1; i < i_sqrt; i++) {
        // if (i == n) {
        // factor.add(i);
        // } else if (n % i == 0) {
        // factor.add(i);
        // factor.add(n / i);
        // }
        // }
        Collections.sort(factor);

        if (factor.size() >= k) {
            bw.write(Integer.toString(factor.get(k - 1)));
        } else {
            bw.write(Integer.toString(0));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
