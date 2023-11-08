package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String nAndx = br.readLine();
        String arrA = br.readLine();

        st = new StringTokenizer(nAndx);

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(arrA);
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (A < X) {
                bw.write(A + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}