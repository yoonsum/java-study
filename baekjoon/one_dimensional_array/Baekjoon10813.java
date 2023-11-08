package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n + 1];

        for (int idx = 1; idx <= n; idx++) {
            basket[idx] = idx;
        }

        for (int idx = 1; idx <= m; idx++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int tmp;

            tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }

        for (int idx = 1; idx <= n; idx++) {
            bw.write(Integer.toString(basket[idx]) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
