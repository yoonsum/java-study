package baekjoon.factor_multiples_decimals2;

import java.io.*;
import java.util.*;

public class Baekjoon2485 {
    public static int getGCD(Set s) {
        Iterator itr = s.iterator();
        int gcd = 0;
        if (s.size() == 1) {
            gcd = (int) itr.next();
        } else {
            gcd = (int) itr.next();
            while (itr.hasNext()) {
                int a = (int) itr.next();
                int b = gcd;
                int r;

                while (b != 0) {
                    r = a % b;
                    a = b;
                    b = r;
                }
                gcd = a;
            }
        }

        return gcd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] position = new int[n];
        Set<Integer> len = new HashSet<>();

        for (int i = 0; i < n; i++) {
            position[i] = Integer.parseInt(br.readLine());
            if (i != 0) {
                len.add(position[i] - position[i - 1]);
            }
        }

        int gcd = getGCD(len);

        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int num = position[i + 1] - position[i];
            if (num > gcd) {
                cnt += (num / gcd - 1);
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
