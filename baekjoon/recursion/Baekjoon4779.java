package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class Baekjoon4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s;

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int count = (int) Math.pow(3, n);

            Character[] arr = new Character[count];
            Arrays.fill(arr, '-');

            for (int i = 1; i <= n; i++) {
                int start = 0;
                int k = (int) Math.pow(3, i);

                while (start < count) {
                    int bar = count / k;
                    for (int j = start; j < start + bar; j++) {
                        if (arr[j] == '-') {
                            if ((start + bar) % 2 == 0) {
                                arr[j] = ' ';
                            }
                        }
                    }
                    start += bar;
                }
            }

            for (int i = 0; i < count; i++) {
                sb.append(arr[i]);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
